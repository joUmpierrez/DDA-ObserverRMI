package uy.edu.cei.observerrmi.server;

import java.rmi.RemoteException;
import uy.edu.cei.observerrmi.common.server.ServerApp;

public class ServerAppImpl implements ServerApp {

	@Override
	public void sayHello(String name) throws RemoteException {
		System.out.println(String.format("Hola %s", name));
	}
}
