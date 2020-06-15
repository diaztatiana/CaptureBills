package com.captbills.capture.interfaces;

import java.util.ArrayList;

import com.captbills.capture.dto.Role;

public interface UserInterface {

	public void setFirstName(String firstName);
	public String getFirstName();
	
	public String getLastName();
	public void setLastName(String lastName);

	public String getMail();
	public void setMail(String mail);

	public String getPassword();
	public void setPassword(String password);

	public String getToken();
	public void setToken(String token);

	public ArrayList<Role> getRoles();
	public void setRoles(ArrayList<Role> roles);

}
