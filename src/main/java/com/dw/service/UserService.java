package com.dw.service;

import com.dw.domain.User;

public interface UserService {
	
	public User getUserById(int userId);

    boolean addUser(User record);
}
