package com.captbills.capture.dto;

import com.captbills.capture.interfaces.BillTypeInterface;

public class BillType implements BillTypeInterface{

	private String type;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BillType [type=" + type + "]";
	}
	
	
}
