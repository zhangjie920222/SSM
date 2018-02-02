package com.gnnt.webservice.impl;

import javax.jws.WebService;
import com.gnnt.webservice.HelloWorld;
@WebService
public class HelloWorldImpl implements HelloWorld{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	
}
