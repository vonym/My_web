package com.briup.day15.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {
		DatagramSocket socket = null;
		DatagramPacket inData = null;
		try {
			socket = new DatagramSocket(9999);
			byte[] b = new byte[50];
			inData = new DatagramPacket(b, b.length);
			socket.receive(inData);
			System.out.println("client say:"
					+ new String(inData.getData(), 0, inData.getLength()));
			System.out.println(inData.getAddress().toString());
			System.out.println(inData.getPort());
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				socket.close();
			}
		}
	}
}
