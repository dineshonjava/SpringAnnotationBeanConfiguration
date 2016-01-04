package com.doj.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired(required=false)
	Engine engine;
	@Autowired
	Tyre tyre;
	@Autowired
	Body body;

	public Car(Engine engine, Tyre tyre, Body body) {
		super();
		this.engine = engine;
		this.tyre = tyre;
		this.body = body;
	}

	public Car() {
		super();
	}
	
	public void driveCar(){
		System.out.println("You are driving a car which has a engine "+this.engine.engineName
				+" has a tyre "+this.tyre.getTyreName()+" has a body "+this.body.getBodyType());
	}
}
