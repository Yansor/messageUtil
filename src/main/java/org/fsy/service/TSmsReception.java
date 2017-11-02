/**
 * TSmsReception.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.fsy.service;

public class TSmsReception  implements java.io.Serializable {
    private String phoneNum;

    private String readFlag;

    private String requestTime;

    private String smsContent;

    private String smsSys;

    private Integer smsid;

    private String subcode;

    public TSmsReception() {
    }

    public TSmsReception(
           String phoneNum,
           String readFlag,
           String requestTime,
           String smsContent,
           String smsSys,
           Integer smsid,
           String subcode) {
           this.phoneNum = phoneNum;
           this.readFlag = readFlag;
           this.requestTime = requestTime;
           this.smsContent = smsContent;
           this.smsSys = smsSys;
           this.smsid = smsid;
           this.subcode = subcode;
    }


    /**
     * Gets the phoneNum value for this TSmsReception.
     * 
     * @return phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }


    /**
     * Sets the phoneNum value for this TSmsReception.
     * 
     * @param phoneNum
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }


    /**
     * Gets the readFlag value for this TSmsReception.
     * 
     * @return readFlag
     */
    public String getReadFlag() {
        return readFlag;
    }


    /**
     * Sets the readFlag value for this TSmsReception.
     * 
     * @param readFlag
     */
    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag;
    }


    /**
     * Gets the requestTime value for this TSmsReception.
     * 
     * @return requestTime
     */
    public String getRequestTime() {
        return requestTime;
    }


    /**
     * Sets the requestTime value for this TSmsReception.
     * 
     * @param requestTime
     */
    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }


    /**
     * Gets the smsContent value for this TSmsReception.
     * 
     * @return smsContent
     */
    public String getSmsContent() {
        return smsContent;
    }


    /**
     * Sets the smsContent value for this TSmsReception.
     * 
     * @param smsContent
     */
    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }


    /**
     * Gets the smsSys value for this TSmsReception.
     * 
     * @return smsSys
     */
    public String getSmsSys() {
        return smsSys;
    }


    /**
     * Sets the smsSys value for this TSmsReception.
     * 
     * @param smsSys
     */
    public void setSmsSys(String smsSys) {
        this.smsSys = smsSys;
    }


    /**
     * Gets the smsid value for this TSmsReception.
     * 
     * @return smsid
     */
    public Integer getSmsid() {
        return smsid;
    }


    /**
     * Sets the smsid value for this TSmsReception.
     * 
     * @param smsid
     */
    public void setSmsid(Integer smsid) {
        this.smsid = smsid;
    }


    /**
     * Gets the subcode value for this TSmsReception.
     * 
     * @return subcode
     */
    public String getSubcode() {
        return subcode;
    }


    /**
     * Sets the subcode value for this TSmsReception.
     * 
     * @param subcode
     */
    public void setSubcode(String subcode) {
        this.subcode = subcode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TSmsReception)) return false;
        TSmsReception other = (TSmsReception) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneNum==null && other.getPhoneNum()==null) || 
             (this.phoneNum!=null &&
              this.phoneNum.equals(other.getPhoneNum()))) &&
            ((this.readFlag==null && other.getReadFlag()==null) || 
             (this.readFlag!=null &&
              this.readFlag.equals(other.getReadFlag()))) &&
            ((this.requestTime==null && other.getRequestTime()==null) || 
             (this.requestTime!=null &&
              this.requestTime.equals(other.getRequestTime()))) &&
            ((this.smsContent==null && other.getSmsContent()==null) || 
             (this.smsContent!=null &&
              this.smsContent.equals(other.getSmsContent()))) &&
            ((this.smsSys==null && other.getSmsSys()==null) || 
             (this.smsSys!=null &&
              this.smsSys.equals(other.getSmsSys()))) &&
            ((this.smsid==null && other.getSmsid()==null) || 
             (this.smsid!=null &&
              this.smsid.equals(other.getSmsid()))) &&
            ((this.subcode==null && other.getSubcode()==null) || 
             (this.subcode!=null &&
              this.subcode.equals(other.getSubcode())));
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
        if (getPhoneNum() != null) {
            _hashCode += getPhoneNum().hashCode();
        }
        if (getReadFlag() != null) {
            _hashCode += getReadFlag().hashCode();
        }
        if (getRequestTime() != null) {
            _hashCode += getRequestTime().hashCode();
        }
        if (getSmsContent() != null) {
            _hashCode += getSmsContent().hashCode();
        }
        if (getSmsSys() != null) {
            _hashCode += getSmsSys().hashCode();
        }
        if (getSmsid() != null) {
            _hashCode += getSmsid().hashCode();
        }
        if (getSubcode() != null) {
            _hashCode += getSubcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TSmsReception.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.efivestar.com", "TSmsReception"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "phoneNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "readFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "requestTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "smsContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsSys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "smsSys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "smsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "subcode"));
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
