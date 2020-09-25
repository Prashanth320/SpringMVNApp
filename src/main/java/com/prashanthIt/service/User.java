package com.prashanthIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashanthIt.beans.UserDao;

@Service
public class User {

	private UserDao dao;

	public User() {
		System.out.println("User default arg constructor");
	}

	@Autowired
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void getName(Integer id) {
		String name = dao.getNameById(id);
		System.out.println(name);
	}
}
