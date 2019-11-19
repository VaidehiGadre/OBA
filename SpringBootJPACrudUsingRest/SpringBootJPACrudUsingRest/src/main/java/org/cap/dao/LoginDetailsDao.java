package org.cap.dao;


import org.cap.entities.Login_Details;

public interface LoginDetailsDao {

	Login_Details createUser(Login_Details user);

	//User updateUser(Integer id, String name);

}
