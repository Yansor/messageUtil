/**
 * TSmsReportKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.fsy.service;

public class TSmsReportKey  implements java.io.Serializable {
    private String smsSys;

    private String smsid;

    public TSmsReportKey() {
    }

    public TSmsReportKey(
           String smsSys,
           String smsid) {
           this.smsSys = smsSys;
           this.smsid = smsid;
    }


    /**
     * Gets the smsSys value for this TSmsReportKey.
     * 
     * @return smsSys
     */
    public String getSmsSys() {
        return smsSys;
    }


    /**
     * Sets the smsSys value for this TSmsReportKey.
     * 
     * @param smsSys
     */
    public void setSmsSys(String smsSys) {
        this.smsSys = smsSys;
    }


    /**
     * Gets the smsid value for this TSmsReportKey.
     * 
     * @return smsid
     */
    public String getSmsid() {
        return smsid;
    }


    /**
     * Sets the smsid value for this TSmsReportKey.
     * 
     * @param smsid
     */
    public void setSmsid(String smsid) {
        this.smsid = smsid;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TSmsReportKey)) return false;
        TSmsReportKey other = (TSmsReportKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smsSys==null && other.getSmsSys()==null) || 
             (this.smsSys!=null &&
              this.smsSys.equals(other.getSmsSys()))) &&
            ((this.smsid==null && other.getSmsid()==null) || 
             (this.smsid!=null &&
              this.smsid.equals(other.getSmsid())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSmsSys() != null) {
            _hashCode += getSmsSys().hashCode();
        }
        if (getSmsid() != null) {
            _hashCode += getSmsid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TSmsReportKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.efivestar.com", "TSmsReportKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsSys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "smsSys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "smsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
