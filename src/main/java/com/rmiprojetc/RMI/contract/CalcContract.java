package com.rmiprojetc.RMI.contract;

import java.rmi.*;

public interface CalcContract extends Remote {
	
	public Integer getSoma(int a, int b) throws RemoteException;
		
	public Integer getSubtracao(int a, int b) throws RemoteException;
		
	public Integer getMultiplicacao(int a, int b) throws RemoteException;
		
	public Integer getDivisao(int a, int b) throws RemoteException;		
}
