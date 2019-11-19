package org.cap.dao;

import org.cap.entities.Login_Details;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class LoginDetailsDaoImpl implements LoginDetailsDao {
	@PersistenceContext
	private EntityManager em;

	public LoginDetailsDaoImpl() {
	}

	@Override
	public Login_Details createUser(Login_Details user) {
		user = em.merge(user);
		return user;
	}

	/*
	 * @Override public Login_Details updateUser(Integer id, String name) {
	 * Login_Details user = em.find(User.class, id); user.setName(name); user =
	 * em.merge(user); return user; }
	 */
}
