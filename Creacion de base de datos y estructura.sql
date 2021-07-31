-- AUTORES

-- GIOVANI DAVID MEZA POGGIO


CREATE DATABASE Farmacia;
go

USE Farmacia;
go

drop table Medicamentos;
-- Se crea la tabla correspondiente para guardar la informacion 
-- de los medicamentos, la cual posee un campo como ID
-- el cual incrementara automaticamente
CREATE TABLE Medicamentos(
Codigo INTEGER IDENTITY,
Medicamento VARCHAR(80),
Dosis VARCHAR(6),
Precio_unitario MONEY,
Cantidad_existencia INTEGER,
Laboratorio_farmaceutico VARCHAR(80),
Vencimiento DATE,
Presentacion VARCHAR(10)
);

go

SELECT * FROM Medicamentos;
go
-- Para el uso de esta tabla en los programas
-- se crea un procedimiento almacenado, el cual
-- se usa para insertar los datos 
-- evitando asi en gran medida el fallo de sintaxis
-- en las consultas

-- Procedimiento para insertar datos
CREATE PROCEDURE sp_insertar_medicamento
@medicamento AS VARCHAR(50),
@Dosis AS VARCHAR(6),
@Precio_unitario AS MONEY,
@Cantidad_existencia AS INTEGER,
@Laboratorio_farmaceutico AS VARCHAR(60),
@Vencimiento AS DATE,
@Presentacion AS VARCHAR(30)
AS
INSERT INTO Medicamentos (Medicamento,Dosis,Precio_unitario,Cantidad_existencia,Laboratorio_farmaceutico,Vencimiento,Presentacion)
VALUES(@medicamento,@Dosis,@Precio_unitario,@Cantidad_existencia,@Laboratorio_farmaceutico,@Vencimiento,@Presentacion);
go

-- LLamando al procedimiento de prueba
EXEC sp_insertar_medicamento "Ibuprofeno","500mg",54.56,100,"Pfizer","2022-12-31", "Tabletas";
go
-- Procedimiento para venta de medicamentos

-- Procedimiento para la eliminacion de medicamentos por vencimiento

-- Se crea una tabla para almacenar la informacion de las facturas
-- emitidas luego de una venta de medicamentos
-- esto para un mejor control del inventario
-- o bien para uso de contabilidad

CREATE TABLE Facturas(
Codigo INTEGER IDENTITY,
Cliente VARCHAR(60),
NIT VARCHAR(8),
Total MONEY
);
go
-- Se crea un trigger en la tabla de medicamentos


BULK INSERT Medicamentos
    FROM 'Ruta_de_archivo.csv'
    WITH
    (
    FIRSTROW = 2,
    FIELDTERMINATOR = ',',  --CSV field delimiter
    ROWTERMINATOR = '\n',   --Use to shift the control to next row
    ERRORFILE = 'Ruta_de_archivoError.csv',
    TABLOCK
    )
	go

	SELECT * FROM Medicamentos;
	go
	-- se crea procedimiento para la actualizacion de inventario
	-- este se puede usar cuando se realice una venta de medicamentos
	-- pero el software es el que debe validar si hay productos disponibles para la venta

	CREATE PROCEDURE sp_venta_actualizacion
	@codigo AS INTEGER,
	@cantidad AS INTEGER
	AS
	UPDATE Medicamentos SET Cantidad_existencia = (Cantidad_existencia - @cantidad) WHERE Codigo = @codigo;
	go

	-- ejecucion del procedimiento almacenado
	-- primero codigo del medicamento, luego la cantidad vendida o a restar
	EXEC sp_venta_actualizacion 1,1;
	go
	-- comando para la busqueda de elementos en la tabla
	-- donde se cambia ace% por el la variable del nombre del medicamento
	-- en el software

	select * from Medicamentos where Medicamento = 'Medicasp';
	SELECT * FROM Medicamentos WHERE Medicamento LIKE 'ace%';
	SELECT * FROM Medicamentos WHERE Laboratorio_farmaceutico LIKE 'farm%';
	go
	