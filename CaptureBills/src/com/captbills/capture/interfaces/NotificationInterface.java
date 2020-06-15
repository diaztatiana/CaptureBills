package com.captbills.capture.interfaces;

import java.util.Date;

import com.captbills.capture.dto.Bill;
import com.captbills.capture.dto.NotificationType;
import com.captbills.capture.dto.User;

public interface NotificationInterface {

	public String getTitle();
	public void setTitle(String title);

	public String getContent();
	public void setContent(String content);

	public Date getDate();
	public void setDate(Date date);

	public Bill getBill();
	public void setBill(Bill bill);

	public User getToUser();
	public void setToUser(User toUser);

	public User getFromUser();
	public void setFromUser(User fromUser);

	public NotificationType getType();
	public void setType(NotificationType type);
	
}
