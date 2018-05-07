package com.rmiprojetc.RMI.main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.server.*;

import com.rmiprojetc.RMI.domain.Servidor;

public class ServidorMain {

	public static void main(String[] args) throws MalformedURLException {
		
		try {
			LocateRegistry.createRegistry(2335);
			Servidor f = new Servidor();
			
			Naming.rebind("//localhost:2335/calc", f);
			System.out.println("Servidor calculadora pronto.");
		}catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}
