package com.vsc.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vsc.ui.views.orderedit.OrderItemEditor;

public class DeleteEvent extends ComponentEvent<OrderItemEditor> {
	public DeleteEvent(OrderItemEditor component) {
		super(component, false);
	}
}