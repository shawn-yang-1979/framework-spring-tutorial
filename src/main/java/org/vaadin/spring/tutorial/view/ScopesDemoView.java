package org.vaadin.spring.tutorial.view;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.spring.tutorial.service.greeter.SpringNativeGreeter;
import org.vaadin.spring.tutorial.service.greeter.UIScopeGreeter;
import org.vaadin.spring.tutorial.service.greeter.VaadinSessionScopeGreeter;
import org.vaadin.spring.tutorial.service.greeter.ViewScopeGreeter;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = ScopesDemoView.VIEW_NAME)
public class ScopesDemoView extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;

	public static final String VIEW_NAME = "scopes-demo";

	@Autowired
	private transient SpringNativeGreeter greeter;

	@Autowired
	private transient VaadinSessionScopeGreeter vaadinSessionScopeGreeter;

	@Autowired
	private transient UIScopeGreeter uiScopeGreeter;

	@Autowired
	private transient ViewScopeGreeter viewScopeGreeter;

	@PostConstruct
	void init() {
		addComponent(new Label("This is to demo scopes"));
		addComponent(new Label(greeter.sayHello()));
		addComponent(new Label(vaadinSessionScopeGreeter.sayHello()));
		addComponent(new Label(uiScopeGreeter.sayHello()));
		addComponent(new Label(viewScopeGreeter.sayHello()));
	}
}