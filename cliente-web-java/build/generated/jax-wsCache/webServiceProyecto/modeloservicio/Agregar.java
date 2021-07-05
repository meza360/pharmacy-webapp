
package modeloservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agregar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agregar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Medicamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Dosis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Precio_unitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Cantidad_existencia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Laboratorio_farmaceutico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Presentacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregar", propOrder = {
    "medicamento",
    "dosis",
    "precioUnitario",
    "cantidadExistencia",
    "laboratorioFarmaceutico",
    "vencimiento",
    "presentacion"
})
public class Agregar {

    @XmlElement(name = "Medicamento")
    protected String medicamento;
    @XmlElement(name = "Dosis")
    protected String dosis;
    @XmlElement(name = "Precio_unitario")
    protected double precioUnitario;
    @XmlElement(name = "Cantidad_existencia")
    protected int cantidadExistencia;
    @XmlElement(name = "Laboratorio_farmaceutico")
    protected String laboratorioFarmaceutico;
    @XmlElement(name = "Vencimiento")
    protected String vencimiento;
    @XmlElement(name = "Presentacion")
    protected String presentacion;

    /**
     * Gets the value of the medicamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicamento() {
        return medicamento;
    }

    /**
     * Sets the value of the medicamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicamento(String value) {
        this.medicamento = value;
    }

    /**
     * Gets the value of the dosis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosis() {
        return dosis;
    }

    /**
     * Sets the value of the dosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosis(String value) {
        this.dosis = value;
    }

    /**
     * Gets the value of the precioUnitario property.
     * 
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Sets the value of the precioUnitario property.
     * 
     */
    public void setPrecioUnitario(double value) {
        this.precioUnitario = value;
    }

    /**
     * Gets the value of the cantidadExistencia property.
     * 
     */
    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    /**
     * Sets the value of the cantidadExistencia property.
     * 
     */
    public void setCantidadExistencia(int value) {
        this.cantidadExistencia = value;
    }

    /**
     * Gets the value of the laboratorioFarmaceutico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaboratorioFarmaceutico() {
        return laboratorioFarmaceutico;
    }

    /**
     * Sets the value of the laboratorioFarmaceutico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaboratorioFarmaceutico(String value) {
        this.laboratorioFarmaceutico = value;
    }

    /**
     * Gets the value of the vencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     * Sets the value of the vencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVencimiento(String value) {
        this.vencimiento = value;
    }

    /**
     * Gets the value of the presentacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * Sets the value of the presentacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentacion(String value) {
        this.presentacion = value;
    }

}
