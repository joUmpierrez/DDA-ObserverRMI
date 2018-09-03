package uy.edu.cei.observerrmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import uy.edu.cei.observerrmi.common.server.ServerApp;

public class App {

	public static void main(String[] args) throws RemoteException {
		System.out.println("Hello World");
		
		ServerApp server = new ServerAppImpl();	//Creo el servidor
		LocateRegistry.createRegistry(1099);	// Creo el puerto
		Registry locateRegistry = LocateRegistry.getRegistry();	// Creo el registro
		ServerApp stub = (ServerApp) UnicastRemoteObject.exportObject(server, 0);
		locateRegistry.rebind("Server", stub);	//Pone el objeto en la 'bolsa'
	}

}
