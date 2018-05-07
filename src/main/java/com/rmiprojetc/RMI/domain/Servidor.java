package com.rmiprojetc.RMI.domain;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import com.rmiprojetc.RMI.contract.*;

public class Servidor extends UnicastRemoteObject implements CalcContract {
	
	public Servidor() throws RemoteException{
		super();
	}

	@Override
	public Integer getSoma(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public Integer getSubtracao(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public Integer getMultiplicacao(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public Integer getDivisao(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a/b;
	}
		
}
