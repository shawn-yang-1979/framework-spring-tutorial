package org.vaadin.spring.tutorial.service.greeter;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;

@SpringComponent
@ViewScope
public class ViewScopeGreeter implements Greeter {
	public String sayHello() {
		return "Hello from a view scoped bean " + toString();
	}
}
