package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	
	List<User> list = List.of(
			new User(1L, "surabhi", "999999"),
			new User(2L, "Makku", "7878"),
			new User(3L, "Akku", "23456")
			);

	@Override
	public User getUser(Long id) {


		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
