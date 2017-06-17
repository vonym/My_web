package com.briup.day16;

import java.util.Map;

public interface Request {
	public String getPathInfo();

	public String getMethod();

	public String getProtocol();

	public String getParameter();

	public String getQueryString();

	public Map<String, String> getParameters();
}
