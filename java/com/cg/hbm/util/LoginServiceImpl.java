package com.cg.hbm.util;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.entites.Admin;
/**
 * 
 * @author lasya bathula
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDao logindao;


	@Override
	public String validateCredintals(Object obj) {
		// TODO Auto-generated method stub
		return logindao.validateCredintals(obj);
	}
	
	@Override
	public List<Admin> listAll() {
		// TODO Auto-generated method stub
		return logindao.findAll();
	}

	@Override
	public Admin loginAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	
}
