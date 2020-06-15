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
		
		final Role user = Services.getRole("User");
		final Role manager = Services.getRole("Manager");
		
		final User johnSmith = Services.getUser("John", "Smith" , "john.smith@gmail.com", "123456", user);
		final User alexLee = Services.getUser("Alex", "Lee" , "alex.lee@gmail.com", "123456", manager);
		
		user.getUsers().add(johnSmith);
		manager.getUsers().add(alexLee);
		johnSmith.getRoles().add(user);
		alexLee.getRoles().add(manager);
		

		
		
		//creation d'un message
		final Message message1 = Services.getMessage("bla bla title", "bla bla bla bla content", new Date(), alexLee, johnSmith, false);
		
		//creation d'une expense
		final Expense expense1 =  Services.getExpense(20, 100, 120);
		
		//creation d'une bill
		final BillType lunch = Services.getBillType("lunch");
		
		final Bill bill1 = Services.getBill(lunch, new Date(), expense1, johnSmith);
		
		//creation d'une notification
		final NotificationType alert = Services.getNotificationType("Alert");
		
		final Notification notif = Services.getNotification("Ma Notif",alert , "Tu as une nouvelle notif",bill1, new Date(), johnSmith, alexLee);

	
	System.out.println("dhdkjhewkd" + bill1);
	}
}
