package com.captbills.capture.test;

import java.util.Date;


import com.captbills.capture.dto.Bill;
import com.captbills.capture.dto.BillType;
import com.captbills.capture.dto.Expense;
import com.captbills.capture.dto.Message;
import com.captbills.capture.dto.Notification;
import com.captbills.capture.dto.NotificationType;
import com.captbills.capture.dto.Role;
import com.captbills.capture.dto.User;

public class Services {

	public static Role getRole(String roleName ) {
		Role role = new Role();
		role.setRole(roleName);
		
		return role;
	}
	
	public static User getUser(String firstName,String lastName,String mail,String password,Role role) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setMail(mail);
		user.setPassword(password);
		user.setToken(null);
		user.addRole(role);
		
		return user;
	}

	public static Message getMessage(String title,String content,Date date,User fromUser,User toUser,  boolean seen) {
		Message message = new Message();
		message.setTitle(title);
		message.setContent(content);
		message.setDate(date);
		message.setFromUser(fromUser);
		message.setToUser(toUser);
		message.setSeen(seen);
		
		return message;
	}
	
	public static Expense getExpense(float taxe, float taxeBase, float totalPrice) {
		Expense expense = new Expense();
		expense.setTaxe(taxe);
		expense.setTaxeBase(taxeBase);
		expense.setTotalPrice(totalPrice);		
		
		return expense;
	}
	
	public static BillType getBillType (String type) {
		BillType billType = new BillType();
		billType.setType(type);
		
		return billType;
	}
	public static Bill getBill (BillType billType, Date date, Expense expense, User user) {
		Bill bill = new Bill();
		bill.setBillType(billType);
		bill.setDate(date);
		bill.setExpense(expense);
		bill.setUser(user);
		
		return bill;
	}
	public static NotificationType getNotificationType(String type) {
		NotificationType notificationType = new NotificationType ();
		notificationType.setType(type);
		
		return notificationType;
	}
	public static Notification getNotification (String title, NotificationType type, String content, Bill bill, Date date, User fromUser, User toUser ) {
		Notification notification = new Notification();
		notification.setTitle(title);
		notification.setType(type);
		notification.setContent(content);
		notification.setBill(bill);
		notification.setDate(date);
		notification.setFromUser(fromUser);
		notification.setToUser(toUser);
		
		return notification;
		
		
	}
	
}

























