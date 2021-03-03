package com.devSense.Lambda;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsecaseSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "google.com";
		int port = 80;
		
		Logger logger = Logger.getLogger("Status Logger");
		logger.setLevel(Level.INFO);
		
		Supplier<String> status = () -> {
			int timeout = 1000;
			try {
				Socket socket = new Socket();
				socket.connect(new InetSocketAddress(host, port), timeout);
				return "up";
			} catch (Exception e) {
				// TODO: handle exception
				return "down";
			}			
		};
		
		try {
			logger.log(Level.INFO, status.get());
			
			/*	Stuff to be done with coderanch goes here
			 * */
		} catch (Exception e) {
			// TODO: handle exception
			logger.log(Level.SEVERE, status.get());
		}

	}

}
