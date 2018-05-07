package com.rmiprojetc.RMI.main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.server.*;

import com.rmiprojetc.RMI.contract.CalcContract;
import com.rmiprojetc.RMI.domain.Servidor;

public class ClienteMain {

	public static void main(String[] args) throws MalformedURLException {
		
		CalcContract calculator;
		
		try {
			calculator = (CalcContract) Naming.lookup("rmi://localhost:2335/calc");
			
			int a = 3;
			int b = 4;
			int f = calculator.getSoma(a, b);
			System.out.println("A soma é: "+f);
			
		}catch (MalformedURLException e) {
			System.out.println("não eg um URI RMI valida.");
		}
		catch (RemoteException e) {
			System.out.println("Objeto Remoto tratou a execucao "+ e+".");
		}
		catch (NotBoundException e) {
			System.out.println("Não foi possivel achar objeto remoto.");
		}
	}

}
