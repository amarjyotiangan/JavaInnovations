package com.ocp.ccs.dms.driver;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppLauncher {

	private static final Logger LOG = Logger.getLogger(AppLauncher.class);
	public static void main(String[] args) {
		
		//SpringApplication.run(AppLauncher.class, args);
		
		HashMap<Integer,String> hMap = new HashMap<Integer,String>();
		hMap.put(1, "Amar");
		hMap.put(2, "ObjectOriented");
		System.out.println(hMap.get(1));
		for(Entry m : hMap.entrySet()) {
			System.out.println("bb " + m.getValue());
		}
		
		String aStrng = "Hello Things added to Git" ;
	}

	
}
