package org.fsy.service;


public interface MessagePlatformServiceImpl extends java.rmi.Remote
{
	public String getReport() throws java.rmi.RemoteException;

	public String notifySmsReception(TSmsReception smsReception) throws java.rmi.RemoteException;

	public String notifySmsDeliveryReceipt(TSmsReport smsReport) throws java.rmi.RemoteException;

	public String getSmsReceptionNew(String code) throws java.rmi.RemoteException;

	public String sendMessage(String source, String bussnissType, String message,
                              String target) throws java.rmi.RemoteException;

	public String getSmsReception(String bussnissType) throws java.rmi.RemoteException;

	public String getMoMessage() throws java.rmi.RemoteException;
}
