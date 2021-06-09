package org.vaadin.spring.tutorial.service.greeter;

import org.springframework.stereotype.Service;

@Service
public class SpringNativeGreeter implements Greeter {
	public String sayHello() {
		return "Hello from a regular spring service bean " + toString();
	}
}