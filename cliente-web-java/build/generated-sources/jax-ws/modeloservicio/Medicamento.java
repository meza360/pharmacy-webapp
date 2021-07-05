
package modeloservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad_existencia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dosis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="laboratorio_farmaceutico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precio_unitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="presentacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicamento", propOrder = {
    "cantidadExistencia",
    "codigo",
    "dosis",
    "laboratorioFarmaceutico",
    "medicamento",
    "precioUnitario",
    "presentacion",
    "vencimiento"
})
public class Medicamento {

    @XmlElement(name = "cantidad_existencia")
    protected int cantidadExistencia;
    protected int codigo;
    protected String dosis;
    @XmlElement(name = "laboratorio_farmaceutico")
    protected String laboratorioFarmaceutico;
    protected String medicamento;
    @XmlElement(name = "precio_unitario")
    protected double precioUnitario;
    protected String presentacion;
    protected String vencimiento;

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
     * Gets the value of the codigo property.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
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

}
