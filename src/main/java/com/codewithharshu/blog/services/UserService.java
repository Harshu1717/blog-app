package com.codewithharshu.blog.services;

import java.util.List;

import com.codewithharshu.blog.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user, Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUser();
	
	void deleteUser(Integer userId);
	

}
