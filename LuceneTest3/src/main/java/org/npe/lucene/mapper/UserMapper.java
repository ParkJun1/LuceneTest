package org.npe.lucene.mapper;

import org.apache.ibatis.annotations.Select;
import org.npe.lucene.vo.UserVO;

public interface UserMapper {

	
	@Select("select user_id, password "
			+ "from tbl_user "
			+ "where user_id = #{user_id} and password = #{password}")
	public UserVO checkUser(UserVO userVO);
	
	
	
	
	
}
