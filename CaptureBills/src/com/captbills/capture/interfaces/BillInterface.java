package com.captbills.capture.interfaces;

import java.sql.Date;

import com.captbills.capture.dto.BillType;
import com.captbills.capture.dto.Expense;
import com.captbills.capture.dto.User;

public interface BillInterface {

	public User getUser();
	public void setUser(User user);

	public Expense getExpense();
	public void setExpense(Expense expense);

	public BillType getBillType();
	public void setBillType(BillType billType);

	public Date getDate();
	public void setDate(Date date);
	
}
