package com.aci.pilot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aci.pilot.client.Client;

@SpringBootApplication
public class PilotProjectApplication {
	
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(PilotProjectApplication.class, args);
        Client client = applicationContext.getBean(Client.class);
		client.create();
		client.read();
    }
}
