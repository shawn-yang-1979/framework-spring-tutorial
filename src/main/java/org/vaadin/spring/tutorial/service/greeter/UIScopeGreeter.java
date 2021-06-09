package org.vaadin.spring.tutorial.service.greeter;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;

@SpringComponent
@UIScope
public class UIScopeGreeter implements Greeter {
	public String sayHello() {
		return "Hello from an UI scope bean " + toString();
	}
}