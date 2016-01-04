package com.doj.spring;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	final String engineName="FORD";

	public String getEngineName() {
		return engineName;
	}

}
