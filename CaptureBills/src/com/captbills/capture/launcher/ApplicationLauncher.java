package com.captbills.capture.launcher;


import java.util.Date;

import com.captbills.capture.dto.Bill;
import com.captbills.capture.dto.BillType;
import com.captbills.capture.dto.Expense;
import com.captbills.capture.dto.Message;
import com.captbills.capture.dto.Notification;
import com.captbills.capture.dto.NotificationType;
import com.captbills.capture.dto.Role;
import com.captbills.capture.dto.User;
import com.captbills.capture.test.Services;


public class ApplicationLauncher {

	public static void main(String[] args) {
		//creation 2 utilisateurs
		
		Role user = Services.getRole("User");
		Role manager = Services.getRole("Manager");
		
		User johnSmith = Services.getUser("John", "Smith" , "john.smith@gmail.com", "123456", user);
		User alexLee = Services.getUser("Alex", "Lee" , "alex.lee@gmail.com", "123456", manager);
		
		//creation d'un message
		Message message1 = Services.getMessage("bla bla title", "bla bla bla bla content", new Date(), alexLee, johnSmith, false);
		
		//creation d'une expense
		Expense expense1 =  Services.getExpense(20, 100, 120);
		
		//creation d'une bill
		BillType lunch = Services.getBillType("lunch");
		
		Bill bill1 = Services.getBill(lunch, new Date(), expense1, johnSmith);
		
		//creation d'une notification
		NotificationType alert = Services.getNotificationType("Alert");
		
		Notification notif = Services.getNotification("Ma Notif",alert , "Tu as une nouvelle notif",bill1, new Date(), johnSmith, alexLee);

	
	System.out.println("dhdkjhewkd" + bill1);
	}
}
