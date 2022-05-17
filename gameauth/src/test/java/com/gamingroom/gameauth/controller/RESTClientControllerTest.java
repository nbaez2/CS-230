package com.gamingroom.gameauth.controller;
//Created package test for game controller under folder


import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RESTClientControllerTest {

	
	public static void main(String[] args) {
		//build the client
		Client client = ClientBuilder.newClient();
		
		WebTarget webTarget = client.target("http://localhost:8080/gameusers");
        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();
        @SuppressWarnings("rawtypes")
        ArrayList gameusers = response.readEntity(ArrayList.class);
        // print statement
        System.out.println(gameusers);

	}

}
