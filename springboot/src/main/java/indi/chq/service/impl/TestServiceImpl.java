package indi.chq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.chq.entity.Users;
import indi.chq.mapper.UsersMapper;
import indi.chq.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private UsersMapper usersMapper;
	
	public Users getUserById(long id) {
		return usersMapper.selectByPrimaryKey(id);
	}

}
