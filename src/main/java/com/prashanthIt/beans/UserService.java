package com.prashanthIt.beans;

import org.springframework.stereotype.Component;

@Component
public class UserService implements UserDao {

	public UserService() {
		System.out.println("User Service constructor");
	}

	@Override
	public String getNameById(Integer id) {
		if (id == 101) {
			return "Prashanth";
		} else if (id == 102) {
			return "Golla";
		}
		return null;
	}

}
