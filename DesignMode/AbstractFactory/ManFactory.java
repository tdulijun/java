package com.qfedu.Day11.DesignMode.AbstractFactory;

import com.qfedu.Day11.DesignMode.SimpleFactory.Person;

public class ManFactory implements INvWaFactory {

	@Override
	public Person CreatePerson() {
		
		return new Man();
	}

}
