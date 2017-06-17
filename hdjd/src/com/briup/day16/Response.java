package com.briup.day16;

import java.io.OutputStream;
import java.io.PrintWriter;

public interface Response {
	public OutputStream getOutputStream();

	public PrintWriter getPrintWriter();

	public void response();
	
}
