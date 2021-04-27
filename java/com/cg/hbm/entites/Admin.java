package com.cg.hbm.entites;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Lasya 
 *
 */

@Entity
@Table(name="Admin")

public class Admin {
	
    @Id
	
	private int admin_id;
	private String admin_name;
	private String password;
	/**
	 * Default constructor
	 */

	public Admin() {

	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 
	 * @param admin_id
	 * @param admin_name
	 * @param password
	 */
	public Admin(int admin_id, String admin_name, String password) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.password = password;
	}
	
}
