
package modeloservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listarNombre complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listarNombre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreMedicamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarNombre", propOrder = {
    "nombreMedicamento"
})
public class ListarNombre {

    protected String nombreMedicamento;

    /**
     * Gets the value of the nombreMedicamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    /**
     * Sets the value of the nombreMedicamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMedicamento(String value) {
        this.nombreMedicamento = value;
    }

}
