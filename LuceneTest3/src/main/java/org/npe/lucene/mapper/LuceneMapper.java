package org.npe.lucene.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.npe.lucene.vo.LucVO;

public interface LuceneMapper {
	
//	@Insert("insert into tbl_keyword(mno, username, keyword) " 
//			+ "values(seq_mno.nextval, #{username}, #{keyword})")
	@Insert("insert into tbl_keyword(username, keyword) " 
			+ "values(#{username}, #{keyword})")
	public void insertVO(LucVO vo);
	
	public void setScore();
	
//	@Select("select /*+INDEX_DESC (tbl_keyword pk_keyword)*/ "
//			+ "round(avg(score)) "
//			+ "from " 
//			+ "tbl_keyword "
//			+ "where " 
//			+ "7 > sysdate - regdate and username = #{username} and mno > 0 "
//			+ "group by username") 
	@Select("select " 
			+	"round(avg(score)) "
			+ "from " 
			+ 	"tbl_keyword "
			+ "where username = #{username} and regdate > date_sub(now(), interval 7 day) " 
			+ "group by username")
	public Integer getScore(String username);

}
