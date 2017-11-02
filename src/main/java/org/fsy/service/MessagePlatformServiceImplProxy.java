package org.fsy.service;



public class MessagePlatformServiceImplProxy implements MessagePlatformServiceImpl
{
	private String _endpoint = null;
	private MessagePlatformServiceImpl messagePlatformServiceImpl = null;

	public MessagePlatformServiceImplProxy()
	{
		_initMessagePlatformServiceImplProxy();
	}

	public MessagePlatformServiceImplProxy(String endpoint)
	{
		_endpoint = endpoint;
		_initMessagePlatformServiceImplProxy();
	}

	private void _initMessagePlatformServiceImplProxy()
	{
		try
		{
			messagePlatformServiceImpl = (new MessagePlatformServiceImplServiceLocator()).getMessagePlatformServiceImpl();
			if (messagePlatformServiceImpl != null)
			{
				if (_endpoint != null) {
					((javax.xml.rpc.Stub) messagePlatformServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address",
							_endpoint);
				}
				else {
					_endpoint = (String) ((javax.xml.rpc.Stub) messagePlatformServiceImpl)
							._getProperty("javax.xml.rpc.service.endpoint.address");
				}
			}

		}
		catch (javax.xml.rpc.ServiceException serviceException)
		{
		}
	}

	public String getEndpoint()
	{
		return _endpoint;
	}

	public void setEndpoint(String endpoint)
	{
		_endpoint = endpoint;
		if (messagePlatformServiceImpl != null)
			((javax.xml.rpc.Stub) messagePlatformServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address",
					_endpoint);

	}

	public MessagePlatformServiceImpl getMessagePlatformServiceImpl()
	{
		if (messagePlatformServiceImpl == null)
			_initMessagePlatformServiceImplProxy();
		return messagePlatformServiceImpl;
	}

	public String getReport() throws java.rmi.RemoteException
	{
		if (messagePlatformServiceImpl == null)
			_initMessagePlatformServiceImplProxy();
		return messagePlatformServiceImpl.getReport();
	}

	public String notifySmsReception(TSmsReception smsReception) throws java.rmi.RemoteException
	{
		if (messagePlatformServiceImpl == null)
			_initMessagePlatformServiceImplProxy();
		return messagePlatformServiceImpl.notifySmsReception(smsReception);
	}

	public String notifySmsDeliveryReceipt(TSmsReport smsReport) throws java.rmi.RemoteException
	{
		if (messagePlatformServiceImpl == null)
			_initMessagePlatformServiceImplProxy();
		return messagePlatformServiceImpl.notifySmsDeliveryReceipt(smsReport);
	}

	public String getSmsReceptionNew(String code) throws java.rmi.RemoteException
	{
		if (messagePlatformServiceImpl == null) {
			_initMessagePlatformServiceImplProxy();
		}
		return messagePlatformServiceImpl.getSmsReceptionNew(code);
	}

	public String sendMessage(String source, String bussnissType, String message,
			String target) throws java.rmi.RemoteException
	{
		if (messagePlatformServiceImpl == null)
			_initMessagePlatformServiceImplProxy();
		return messagePlatformServiceImpl.sendMessage(source, bussnissType, message, target);
	}

	public String getSmsReception(String bussnissType) throws java.rmi.RemoteException
	{
		if (messagePlatformServiceImpl == null)
			_initMessagePlatformServiceImplProxy();
		return messagePlatformServiceImpl.getSmsReception(bussnissType);
	}

	public String getMoMessage() throws java.rmi.RemoteException
	{
		if (messagePlatformServiceImpl == null)
			_initMessagePlatformServiceImplProxy();
		return messagePlatformServiceImpl.getMoMessage();
	}


}
