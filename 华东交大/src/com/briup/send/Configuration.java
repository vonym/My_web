package com.briup.send;

import com.briup.bean.ClientImpl;
import com.briup.bean.DBImple;
import com.briup.bean.ServerImpl;
import com.briup.gather.Gather;

public interface Configuration {
	ServerImpl getServer() throws Exception;

	DBImple getDBStore() throws Exception;

	ClientImpl getClient() throws Exception;

	Gather getGather() throws Exception;
}
