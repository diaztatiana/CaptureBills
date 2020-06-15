package com.captbills.capture.dto;

import com.captbills.capture.interfaces.NotificationTypeInterface;

public class NotificationType implements NotificationTypeInterface{

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
