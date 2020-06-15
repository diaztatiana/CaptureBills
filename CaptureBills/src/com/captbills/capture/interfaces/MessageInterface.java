package com.captbills.capture.interfaces;

import java.util.Date;

import com.captbills.capture.dto.User;

public interface MessageInterface {

	public String getTitle();
	public void setTitle(String title);
	
	public String getContent();
	public void setContent(String content);
	
	public Date getDate();
	public void setDate(Date date);
	
	public User getFromUser();
	public void setFromUser(User fromUser);
	
	public User getToUser();
	public void setToUser(User toUser);
	
	public boolean isSeen();
	public void setSeen(boolean seen);
}
