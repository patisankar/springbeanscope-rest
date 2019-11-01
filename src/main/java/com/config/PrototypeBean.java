package com.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class PrototypeBean {

	private List<String>  names = new ArrayList<>();
	
	public void method(String name) {
		names.add(name);
		System.out.println(name+"---------" +names.size());
		
	}
}
