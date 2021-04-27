package com.cg.hbm.util;

import java.util.List;

import com.cg.hbm.entites.Admin;

/**
 * 
 * @author Lasya Bathula
 *
 */

public interface LoginDao {
  /**
   * 
   * @param obj
   * @return
   */
	
	public String validateCredintals(Object obj);

	

	public List<Admin> findAll();

}