//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.22 at 07:54:58 AM EDT 
//


package org.xframium.driver.xsd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the cloud information for a collection of devices
 * 
 * <p>Java class for xCloud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xCloud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="provider" default="LOCAL">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="XML"/>
 *             &lt;enumeration value="SQL"/>
 *             &lt;enumeration value="CSV"/>
 *             &lt;enumeration value="EXCEL"/>
 *             &lt;enumeration value="LOCAL"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="proxyUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proxyPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="providerType" default="PERFECTO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="PERFECTO"/>
 *             &lt;enumeration value="SAUCELABS"/>
 *             &lt;enumeration value="SELENIUM"/>
 *             &lt;enumeration value="WINDOWS"/>
 *             &lt;enumeration value="BROWSERSTACK"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="gesture" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="deviceAction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xCloud")
public class XCloud {

    @XmlAttribute(name = "provider")
    protected String provider;
    @XmlAttribute(name = "fileName")
    protected String fileName;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "hostName")
    protected String hostName;
    @XmlAttribute(name = "userName")
    protected String userName;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "proxyHost")
    protected String proxyHost;
    @XmlAttribute(name = "proxyPort")
    protected BigInteger proxyPort;
    @XmlAttribute(name = "proxyUser")
    protected String proxyUser;
    @XmlAttribute(name = "proxyPassword")
    protected String proxyPassword;
    @XmlAttribute(name = "grid")
    protected String grid;
    @XmlAttribute(name = "providerType")
    protected String providerType;
    @XmlAttribute(name = "gesture")
    protected String gesture;
    @XmlAttribute(name = "deviceAction")
    protected String deviceAction;

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        if (provider == null) {
            return "LOCAL";
        } else {
            return provider;
        }
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the proxyHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyHost() {
        return proxyHost;
    }

    /**
     * Sets the value of the proxyHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyHost(String value) {
        this.proxyHost = value;
    }

    /**
     * Gets the value of the proxyPort property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProxyPort() {
        if (proxyPort == null) {
            return new BigInteger("0");
        } else {
            return proxyPort;
        }
    }

    /**
     * Sets the value of the proxyPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProxyPort(BigInteger value) {
        this.proxyPort = value;
    }

    /**
     * Gets the value of the proxyUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyUser() {
        return proxyUser;
    }

    /**
     * Sets the value of the proxyUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyUser(String value) {
        this.proxyUser = value;
    }

    /**
     * Gets the value of the proxyPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyPassword() {
        return proxyPassword;
    }

    /**
     * Sets the value of the proxyPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyPassword(String value) {
        this.proxyPassword = value;
    }

    /**
     * Gets the value of the grid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrid() {
        return grid;
    }

    /**
     * Sets the value of the grid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrid(String value) {
        this.grid = value;
    }

    /**
     * Gets the value of the providerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderType() {
        if (providerType == null) {
            return "PERFECTO";
        } else {
            return providerType;
        }
    }

    /**
     * Sets the value of the providerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderType(String value) {
        this.providerType = value;
    }

    /**
     * Gets the value of the gesture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGesture() {
        return gesture;
    }

    /**
     * Sets the value of the gesture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGesture(String value) {
        this.gesture = value;
    }

    /**
     * Gets the value of the deviceAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceAction() {
        return deviceAction;
    }

    /**
     * Sets the value of the deviceAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceAction(String value) {
        this.deviceAction = value;
    }

}
