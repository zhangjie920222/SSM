package com.gnnt.dao;

import java.util.List;

import com.gnnt.model.User;

public interface UserMapper {
	List<User> findAllUser();
}
