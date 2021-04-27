package com.cg.hbm.controller;
import com.cg.hbm.entites.Admin;

import com.cg.hbm.util.LoginService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Lasya Bathula
 *
 */
@RestController
@CrossOrigin(origins= "http://localhost:56671")
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private LoginService loginservice;
	/**
	 * 
	 * @param admin_id
	 * @param password
	 * @return
	 */
	
	@GetMapping()
	public List<Admin>listAllUser(){
		return loginservice.listAll();
	}

	@GetMapping("/admin/{admin_id}/{password}")
	public String validateUser(@PathVariable("admin_id") int admin_id, @PathVariable("password") String password) {

		Admin admin = new Admin();
		admin.setAdmin_id(admin_id);
		admin.setPassword(password);
		return loginservice.validateCredintals(admin);
	}


	
	
	@PostMapping("/login")
	public Admin loginAdmin(@RequestBody Admin admin)  {
		
		return loginservice.loginAdmin(admin);
	}
}
	
	


