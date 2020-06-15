package com.captbills.capture.dto;

import java.util.Date;

import com.captbills.capture.interfaces.BillInterface;

public class Bill implements BillInterface{

	private User user;
	private Expense expense;
	private BillType billType;
	private Date date;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public Expense getExpense() {
		return expense;
	}
	public void setExpense(Expense expense) {
		this.expense = expense;
	}

	public BillType getBillType() {
		return billType;
	}
	public void setBillType(BillType billType) {
		this.billType = billType;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Bill [user=" + user + ", expense=" + expense + ", billType=" + billType + ", date=" + date + "]";
	}
	
	
	
}
