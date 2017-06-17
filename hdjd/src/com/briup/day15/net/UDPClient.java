package com.briup.day15.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {
	public static void main(String[] args) {
		DatagramSocket socket = null;
		DatagramPacket outData = null;
		try {
			socket = new DatagramSocket();
			byte[] b = "今天天气好晴朗".getBytes();
			outData = new DatagramPacket(b, b.length,
					InetAddress.getByName("127.0.0.1"), 9999);
			socket.send(outData);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
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
