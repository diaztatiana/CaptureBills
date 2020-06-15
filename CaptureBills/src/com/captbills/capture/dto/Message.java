package com.captbills.capture.dto;

import java.util.Date;

import com.captbills.capture.interfaces.MessageInterface;

public class Message implements MessageInterface {

	private String title;
	private String content;
	private Date date;
	private User fromUser;
	private User toUser;
	private boolean seen;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public User getFromUser() {
		return fromUser;
	}
	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	public User getToUser() {
		return toUser;
	}
	public void setToUser(User toUser) {
		this.toUser = toUser;
	}
	
	public boolean isSeen() {
		return seen;
	}
	public void setSeen(boolean seen) {
		this.seen = seen;
	}
	
	@Override
	public String toString() {
		return "Message [title=" + title + ", content=" + content + ", date=" + date + ", fromUser=" + fromUser
				+ ", toUser=" + toUser + "]";
	}

	
}
