package org.cap.service;

import org.cap.dao.LoginDetailsDao;
import org.cap.entities.Login_Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class LoginDetailsServiceImpl implements LoginDetailsService {

	@Autowired
    private LoginDetailsDao dao;
	
	public LoginDetailsDao getDao(){
        return dao;
    }

    public void setDao(LoginDetailsDao dao){
        this.dao=dao;
    }
    
    @Override
    public Login_Details createUser(Login_Details user) {
       // transaction opened by spring
         user= dao.createUser(user);
        //transaction closed by spring
        return user;
    }
}
