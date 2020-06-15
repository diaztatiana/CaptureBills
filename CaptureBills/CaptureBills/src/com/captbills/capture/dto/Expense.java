package com.captbills.capture.dto;

import com.captbills.capture.interfaces.ExpenseInterface;

public class Expense implements ExpenseInterface{

	private float taxeBase;
	private float taxe;
	private float totalPrice;

	public float getTaxeBase() {
		return taxeBase;
	}

	public void setTaxeBase(float taxeBase) {
		this.taxeBase = taxeBase;
	}

	public float getTaxe() {
		return taxe;
	}

	public void setTaxe(float taxe) {
		this.taxe = taxe;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

}
