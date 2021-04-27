package com.cg.hbm.util;

import java.util.List;

import com.cg.hbm.entites.Admin;

/**
 * 
 * @author DELL
 *
 */
public interface LoginService {
 public String validateCredintals(Object obj);
 
 public List<Admin> listAll();




public Admin loginAdmin(Admin admin); 

 


}
