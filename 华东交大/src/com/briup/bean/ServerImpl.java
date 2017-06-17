package com.briup.bean;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Properties;

import com.briup.send.ConfigrationImpl;
import com.briup.send.WossModueInit;

public class ServerImpl implements WossModueInit {
	private static int port;
	private static ConfigrationImpl con;
	static {
		con = new ConfigrationImpl();
	}

	@Override
	public void init(Properties properties) {
		port = Integer.parseInt(properties.getProperty("port"));
	}

	public void receive() {
		try {
			ServerSocket server = new ServerSocket(port);
			Socket socket = server.accept();
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			List<BIDR> list = (List<BIDR>) ois.readObject();
			con.getDBStore().dbStroe(list);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			con.getServer().receive();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
