package com.captbills.capture.dto;

import java.util.ArrayList;

import com.captbills.capture.interfaces.RoleInterface;

public class Role implements RoleInterface{

	private String role;
	private ArrayList<User> users;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
}
