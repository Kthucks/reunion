package com.googlecode.reunion.jreunion.events;

import java.net.Socket;

import com.googlecode.reunion.jreunion.server.Client;

public class NetworkDisconnectEvent extends NetworkEvent{

	public NetworkDisconnectEvent(Socket socket) {
		super(socket);
	}

}
