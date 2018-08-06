package com.customerapi.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.customerapi.endpoint.CustomerEndpoint;

@Component
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig()
	{
		register(CustomerEndpoint.class);
	}

}
