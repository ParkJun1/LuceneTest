package org.npe.lucene.service;

import javax.inject.Inject;

import org.npe.lucene.mapper.UserMapper;
import org.npe.lucene.vo.UserVO;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserService {
	
	@Inject
	UserMapper mapper;
	
	public UserVO checkUser(UserVO userVO) throws Exception {
		return mapper.checkUser(userVO);
	}
	
}
