package com.captbills.capture.interfaces;

import java.util.ArrayList;

import com.captbills.capture.dto.User;

public interface RoleInterface {

	public String getRole();
	public void setRole(String role);

	public ArrayList<User> getUsers();
	public void setUsers(ArrayList<User> users);
	
}


