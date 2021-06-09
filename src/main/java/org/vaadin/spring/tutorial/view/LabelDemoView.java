package org.vaadin.spring.tutorial.view;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = LabelDemoView.VIEW_NAME)
public class LabelDemoView extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;

	public static final String VIEW_NAME = "label-demo";

	@PostConstruct
	void init() {

		String longText = "Please see the customized .v-label in apptheme.scss for handling this very long label text. Resize the window you will see ellipsis. Very long label text very long label text Very long label text very long label text Very long label text very long label text";

		HorizontalLayout bar = new HorizontalLayout();
		bar.setWidthFull();
		Label label = new Label(longText);
		Button btn = new Button(":");
		bar.addComponents(label, btn);
		bar.setExpandRatio(label, 1);
		addComponent(bar);
	}
}