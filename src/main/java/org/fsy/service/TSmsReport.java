/**
 * TSmsReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.fsy.service;

public class TSmsReport extends TSmsReportKey implements java.io.Serializable
{
	private String phoneNum;

	private String smsStatus;

	private String smsStatusDesc;

	public TSmsReport()
	{
	}

	public TSmsReport(String smsSys, String smsid, String phoneNum,
			String smsStatus, String smsStatusDesc)
	{
		super(smsSys, smsid);
		this.phoneNum = phoneNum;
		this.smsStatus = smsStatus;
		this.smsStatusDesc = smsStatusDesc;
	}


	/**
	 * Gets the phoneNum value for this TSmsReport.
	 * 
	 * @return phoneNum
	 */
	public String getPhoneNum()
	{
		return phoneNum;
	}


	/**
	 * Sets the phoneNum value for this TSmsReport.
	 * 
	 * @param phoneNum
	 */
	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}


	/**
	 * Gets the smsStatus value for this TSmsReport.
	 * 
	 * @return smsStatus
	 */
	public String getSmsStatus()
	{
		return smsStatus;
	}


	/**
	 * Sets the smsStatus value for this TSmsReport.
	 * 
	 * @param smsStatus
	 */
	public void setSmsStatus(String smsStatus)
	{
		this.smsStatus = smsStatus;
	}


	/**
	 * Gets the smsStatusDesc value for this TSmsReport.
	 * 
	 * @return smsStatusDesc
	 */
	public String getSmsStatusDesc()
	{
		return smsStatusDesc;
	}


	/**
	 * Sets the smsStatusDesc value for this TSmsReport.
	 * 
	 * @param smsStatusDesc
	 */
	public void setSmsStatusDesc(String smsStatusDesc)
	{
		this.smsStatusDesc = smsStatusDesc;
	}

	private Object __equalsCalc = null;

	public synchronized boolean equals(Object obj)
	{
		if (!(obj instanceof TSmsReport)) {
			return false;
		}
		TSmsReport other = (TSmsReport) obj;
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null)
		{
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj)
				&& ((this.phoneNum == null && other.getPhoneNum() == null)
						|| (this.phoneNum != null && this.phoneNum.equals(other.getPhoneNum())))
				&& ((this.smsStatus == null && other.getSmsStatus() == null)
						|| (this.smsStatus != null && this.smsStatus.equals(other.getSmsStatus())))
				&& ((this.smsStatusDesc == null && other.getSmsStatusDesc() == null)
						|| (this.smsStatusDesc != null && this.smsStatusDesc.equals(other.getSmsStatusDesc())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
	public synchronized int hashCode()
	{
		if (__hashCodeCalc)
		{
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = super.hashCode();
		if (getPhoneNum() != null)
		{
			_hashCode += getPhoneNum().hashCode();
		}
		if (getSmsStatus() != null)
		{
			_hashCode += getSmsStatus().hashCode();
		}
		if (getSmsStatusDesc() != null)
		{
			_hashCode += getSmsStatusDesc().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}


	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			TSmsReport.class, true);

	static
	{
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.efivestar.com", "TSmsReport"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("phoneNum");
		elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "phoneNum"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("smsStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "smsStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("smsStatusDesc");
		elemField.setXmlName(new javax.xml.namespace.QName("http://model.efivestar.com", "smsStatusDesc"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc()
	{
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(String mechType, Class _javaType,
			javax.xml.namespace.QName _xmlType)
	{
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(String mechType,
			Class _javaType, javax.xml.namespace.QName _xmlType)
	{
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
