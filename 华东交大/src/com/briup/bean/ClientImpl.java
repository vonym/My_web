package com.briup.bean;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.Properties;

import com.briup.send.ConfigrationImpl;
import com.briup.send.WossModueInit;

public class ClientImpl implements WossModueInit {
	private String ip;
	private int port;
	private static ConfigrationImpl con;
	static {
		con = new ConfigrationImpl();
	}

	@Override
	public void init(Properties properties) {
		ip = properties.getProperty("ip");
		port = Integer.parseInt(properties.getProperty("port"));
	}

	public void send() {
		try {
			Socket socket = new Socket(ip, port);
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			Collection<BIDR> collection = con.getGather().gather();
			oos.writeObject(collection);
			oos.flush();
			oos.close();
			os.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			con.getClient().send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
