
package modeloservicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicios", targetNamespace = "http://ModeloServicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicios {


    /**
     * 
     * @param codigo
     * @param cantidad
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ventaActualizar", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.VentaActualizar")
    @ResponseWrapper(localName = "ventaActualizarResponse", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.VentaActualizarResponse")
    @Action(input = "http://ModeloServicio/Servicios/ventaActualizarRequest", output = "http://ModeloServicio/Servicios/ventaActualizarResponse")
    public Integer ventaActualizar(
        @WebParam(name = "Codigo", targetNamespace = "")
        int codigo,
        @WebParam(name = "Cantidad", targetNamespace = "")
        int cantidad);

    /**
     * 
     * @param rutaArchivo
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarArchivo", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.InsertarArchivo")
    @ResponseWrapper(localName = "insertarArchivoResponse", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.InsertarArchivoResponse")
    @Action(input = "http://ModeloServicio/Servicios/insertarArchivoRequest", output = "http://ModeloServicio/Servicios/insertarArchivoResponse")
    public Integer insertarArchivo(
        @WebParam(name = "rutaArchivo", targetNamespace = "")
        String rutaArchivo);

    /**
     * 
     * @param vencimiento
     * @param precioUnitario
     * @param cantidadExistencia
     * @param dosis
     * @param presentacion
     * @param medicamento
     * @param laboratorioFarmaceutico
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregar", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.Agregar")
    @ResponseWrapper(localName = "agregarResponse", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.AgregarResponse")
    @Action(input = "http://ModeloServicio/Servicios/agregarRequest", output = "http://ModeloServicio/Servicios/agregarResponse")
    public String agregar(
        @WebParam(name = "Medicamento", targetNamespace = "")
        String medicamento,
        @WebParam(name = "Dosis", targetNamespace = "")
        String dosis,
        @WebParam(name = "Precio_unitario", targetNamespace = "")
        double precioUnitario,
        @WebParam(name = "Cantidad_existencia", targetNamespace = "")
        int cantidadExistencia,
        @WebParam(name = "Laboratorio_farmaceutico", targetNamespace = "")
        String laboratorioFarmaceutico,
        @WebParam(name = "Vencimiento", targetNamespace = "")
        String vencimiento,
        @WebParam(name = "Presentacion", targetNamespace = "")
        String presentacion);

    /**
     * 
     * @param nombreMedicamento
     * @return
     *     returns java.util.List<modeloservicio.Medicamento>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarNombre", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.ListarNombre")
    @ResponseWrapper(localName = "listarNombreResponse", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.ListarNombreResponse")
    @Action(input = "http://ModeloServicio/Servicios/listarNombreRequest", output = "http://ModeloServicio/Servicios/listarNombreResponse")
    public List<Medicamento> listarNombre(
        @WebParam(name = "nombreMedicamento", targetNamespace = "")
        String nombreMedicamento);

    /**
     * 
     * @param codigo
     * @return
     *     returns modeloservicio.Medicamento
     */
    @WebMethod(operationName = "Eliminar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Eliminar", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.Eliminar")
    @ResponseWrapper(localName = "EliminarResponse", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.EliminarResponse")
    @Action(input = "http://ModeloServicio/Servicios/EliminarRequest", output = "http://ModeloServicio/Servicios/EliminarResponse")
    public Medicamento eliminar(
        @WebParam(name = "Codigo", targetNamespace = "")
        int codigo);

    /**
     * 
     * @param vencimiento
     * @param codigo
     * @param precioUnitario
     * @param cantidadExistencia
     * @param dosis
     * @param presentacion
     * @param medicamento
     * @param laboratorioFarmaceutico
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Actualizar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Actualizar", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.Actualizar")
    @ResponseWrapper(localName = "ActualizarResponse", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.ActualizarResponse")
    @Action(input = "http://ModeloServicio/Servicios/ActualizarRequest", output = "http://ModeloServicio/Servicios/ActualizarResponse")
    public String actualizar(
        @WebParam(name = "Codigo", targetNamespace = "")
        int codigo,
        @WebParam(name = "Medicamento", targetNamespace = "")
        String medicamento,
        @WebParam(name = "Dosis", targetNamespace = "")
        String dosis,
        @WebParam(name = "Precio_unitario", targetNamespace = "")
        double precioUnitario,
        @WebParam(name = "Cantidad_existencia", targetNamespace = "")
        int cantidadExistencia,
        @WebParam(name = "Laboratorio_farmaceutico", targetNamespace = "")
        String laboratorioFarmaceutico,
        @WebParam(name = "Vencimiento", targetNamespace = "")
        String vencimiento,
        @WebParam(name = "Presentacion", targetNamespace = "")
        String presentacion);

    /**
     * 
     * @param laboratorioFarmaceutico
     * @return
     *     returns java.util.List<modeloservicio.Medicamento>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarLaboratorio", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.ListarLaboratorio")
    @ResponseWrapper(localName = "listarLaboratorioResponse", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.ListarLaboratorioResponse")
    @Action(input = "http://ModeloServicio/Servicios/listarLaboratorioRequest", output = "http://ModeloServicio/Servicios/listarLaboratorioResponse")
    public List<Medicamento> listarLaboratorio(
        @WebParam(name = "LaboratorioFarmaceutico", targetNamespace = "")
        String laboratorioFarmaceutico);

    /**
     * 
     * @return
     *     returns java.util.List<modeloservicio.Medicamento>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarMedicamentos", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.ListarMedicamentos")
    @ResponseWrapper(localName = "listarMedicamentosResponse", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.ListarMedicamentosResponse")
    @Action(input = "http://ModeloServicio/Servicios/listarMedicamentosRequest", output = "http://ModeloServicio/Servicios/listarMedicamentosResponse")
    public List<Medicamento> listarMedicamentos();

    /**
     * 
     * @param codigo
     * @return
     *     returns modeloservicio.Medicamento
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarcodigo", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.Listarcodigo")
    @ResponseWrapper(localName = "listarcodigoResponse", targetNamespace = "http://ModeloServicio/", className = "modeloservicio.ListarcodigoResponse")
    @Action(input = "http://ModeloServicio/Servicios/listarcodigoRequest", output = "http://ModeloServicio/Servicios/listarcodigoResponse")
    public Medicamento listarcodigo(
        @WebParam(name = "Codigo", targetNamespace = "")
        int codigo);

}
