//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.22 at 07:54:58 AM EDT 
//


package org.xframium.driver.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines an Artifact that is to be produced during test execution
 * 
 * <p>Java class for xArtifact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xArtifact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="EXECUTION_REPORT_PDF"/>
 *             &lt;enumeration value="EXECUTION_REPORT_HTML"/>
 *             &lt;enumeration value="EXECUTION_REPORT_XML"/>
 *             &lt;enumeration value="EXECUTION_REPORT_CSV"/>
 *             &lt;enumeration value="FAILURE_SOURCE"/>
 *             &lt;enumeration value="FAILURE_SOURCE_HTML"/>
 *             &lt;enumeration value="IMAGING_ANALYSIS"/>
 *             &lt;enumeration value="DEVICE_LOG"/>
 *             &lt;enumeration value="CONSOLE_LOG"/>
 *             &lt;enumeration value="EXECUTION_RECORD_HTML"/>
 *             &lt;enumeration value="EXECUTION_RECORD_CSV"/>
 *             &lt;enumeration value="EXECUTION_RECORD"/>
 *             &lt;enumeration value="EXECUTION_TIMING"/>
 *             &lt;enumeration value="EXECUTION_DEFINITION"/>
 *             &lt;enumeration value="DEBUGGER"/>
 *             &lt;enumeration value="SAUCE_LABS"/>
 *             &lt;enumeration value="REPORTIUM"/>
 *             &lt;enumeration value="EXECUTION_RECORD_JSON"/>
 *             &lt;enumeration value="GRID_REPORT"/>
 *             &lt;enumeration value="GRID_HTML"/>
 *             &lt;enumeration value="ADD_TO_CSV"/>
 *             &lt;enumeration value="ALM_DEFECT"/>
 *             &lt;enumeration value="EXECUTION_SUITE_JSON"/>
 *             &lt;enumeration value="EXECUTION_SUITE_HTML"/>
 *             &lt;enumeration value="EXECUTION_HISTORY_JSON"/>
 *             &lt;enumeration value="EXECUTION_HISTORY_HTML"/>
 *             &lt;enumeration value="WIND_TUNNEL"/>
 *             &lt;enumeration value="EXECUTION_TEST_JSON"/>
 *             &lt;enumeration value="EXECUTION_TEST_HTML"/>
 *             &lt;enumeration value="TIMING_HTML"/>
 *             &lt;enumeration value="STATISTICS"/>
 *             &lt;enumeration value="ALL_IN_ONE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xArtifact")
public class XArtifact {

    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "active")
    protected Boolean active;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isActive() {
        if (active == null) {
            return true;
        } else {
            return active;
        }
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

}
