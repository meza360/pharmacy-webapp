
package modeloservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listarLaboratorio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listarLaboratorio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LaboratorioFarmaceutico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarLaboratorio", propOrder = {
    "laboratorioFarmaceutico"
})
public class ListarLaboratorio {

    @XmlElement(name = "LaboratorioFarmaceutico")
    protected String laboratorioFarmaceutico;

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

}
