package org.vaadin.spring.tutorial.service.greeter;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.VaadinSessionScope;

@SpringComponent
@VaadinSessionScope
public class VaadinSessionScopeGreeter implements Greeter {
	public String sayHello() {
		return "Hello from a vaadin session scoped bean " + toString();
	}
}
