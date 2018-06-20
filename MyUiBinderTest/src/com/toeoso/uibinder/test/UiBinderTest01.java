package com.toeoso.uibinder.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class UiBinderTest01 extends Composite implements HasText {

	private static UiBinderTest01UiBinder uiBinder = GWT
			.create(UiBinderTest01UiBinder.class);

	interface UiBinderTest01UiBinder extends UiBinder<Widget, UiBinderTest01> {
	}

	public UiBinderTest01() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button button;

	public UiBinderTest01(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

	public void setText(String text) {
		button.setText(text);
	}

	public String getText() {
		return button.getText();
	}

}
