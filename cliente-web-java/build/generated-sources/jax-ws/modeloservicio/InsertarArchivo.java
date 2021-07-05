
package modeloservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertarArchivo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertarArchivo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rutaArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarArchivo", propOrder = {
    "rutaArchivo"
})
public class InsertarArchivo {

    protected String rutaArchivo;

    /**
     * Gets the value of the rutaArchivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaArchivo() {
        return rutaArchivo;
    }

    /**
     * Sets the value of the rutaArchivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaArchivo(String value) {
        this.rutaArchivo = value;
    }

}
