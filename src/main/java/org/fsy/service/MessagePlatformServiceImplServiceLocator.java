/**
 * MessagePlatformServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.fsy.service;

public class MessagePlatformServiceImplServiceLocator extends org.apache.axis.client.Service
		implements MessagePlatformServiceImplService
{

	public MessagePlatformServiceImplServiceLocator()
	{
	}


	public MessagePlatformServiceImplServiceLocator(org.apache.axis.EngineConfiguration config)
	{
		super(config);
	}

	public MessagePlatformServiceImplServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException
	{
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for MessagePlatformServiceImpl
	private String MessagePlatformServiceImpl_address = "http://172.20.3.37:8080/MessagePlatform/services/MessagePlatformServiceImpl";

	public String getMessagePlatformServiceImplAddress()
	{
		return MessagePlatformServiceImpl_address;
	}

	// The WSDD service name defaults to the port name.
	private String MessagePlatformServiceImplWSDDServiceName = "MessagePlatformServiceImpl";

	public String getMessagePlatformServiceImplWSDDServiceName()
	{
		return MessagePlatformServiceImplWSDDServiceName;
	}

	public void setMessagePlatformServiceImplWSDDServiceName(String name)
	{
		MessagePlatformServiceImplWSDDServiceName = name;
	}

	public MessagePlatformServiceImpl getMessagePlatformServiceImpl() throws javax.xml.rpc.ServiceException
	{
		java.net.URL endpoint;
		try
		{
			endpoint = new java.net.URL(MessagePlatformServiceImpl_address);
		}
		catch (java.net.MalformedURLException e)
		{
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getMessagePlatformServiceImpl(endpoint);
	}

	public MessagePlatformServiceImpl getMessagePlatformServiceImpl(java.net.URL portAddress)
			throws javax.xml.rpc.ServiceException
	{
		try
		{
			MessagePlatformServiceImplSoapBindingStub _stub = new MessagePlatformServiceImplSoapBindingStub(portAddress,
					this);
			_stub.setPortName(getMessagePlatformServiceImplWSDDServiceName());
			return _stub;
		}
		catch (org.apache.axis.AxisFault e)
		{
			return null;
		}
	}

	public void setMessagePlatformServiceImplEndpointAddress(String address)
	{
		MessagePlatformServiceImpl_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no port for the given interface, then
	 * ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException
	{
		try
		{
			if (MessagePlatformServiceImpl.class.isAssignableFrom(serviceEndpointInterface))
			{
				MessagePlatformServiceImplSoapBindingStub _stub = new MessagePlatformServiceImplSoapBindingStub(
						new java.net.URL(MessagePlatformServiceImpl_address), this);
				_stub.setPortName(getMessagePlatformServiceImplWSDDServiceName());
				return _stub;
			}
		}
		catch (Throwable t)
		{
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no port for the given interface, then
	 * ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException
	{
		if (portName == null)
		{
			return getPort(serviceEndpointInterface);
		}
		String inputPortName = portName.getLocalPart();
		if ("MessagePlatformServiceImpl".equals(inputPortName))
		{
			return getMessagePlatformServiceImpl();
		}
		else
		{
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName()
	{
		return new javax.xml.namespace.QName("http://impl.service.mp.efivestar.com", "MessagePlatformServiceImplService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts()
	{
		if (ports == null)
		{
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://impl.service.mp.efivestar.com", "MessagePlatformServiceImpl"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(String portName, String address)
			throws javax.xml.rpc.ServiceException
	{

		if ("MessagePlatformServiceImpl".equals(portName))
		{
			setMessagePlatformServiceImplEndpointAddress(address);
		}
		else
		{ // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName, String address)
			throws javax.xml.rpc.ServiceException
	{
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
