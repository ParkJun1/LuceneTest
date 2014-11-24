package org.npe.lucene.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.npe.lucene.util.SqlAgent;
import org.npe.lucene.vo.LucVO;

public class BatchDAO {
	
/*	private static SqlSessionFactory sqlMapper;
	
	static{
		try{
			Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String getTime() throws Exception {
		try(SqlSession session = sqlMapper.openSession()){
			
			return session.selectOne("org.npe.mapper.BatchMapper.getTime");
		}
	}*/
	
	private static final String MYSQL_JDBC_DRIVER_MYSQL_DRIVER = "com.mysql.jdbc.Driver";
//	private static final String ORG_APACHE_COMMONS_DBCP_POOLING_DRIVER = "org.apache.commons.dbcp.PoolingDriver";
//	private static final String JDBC_APACHE_COMMONS_DBCP_POOL = "jdbc:apache:commons:dbcp:/pool";
	
	private static final String url = "jdbc:mysql://61.72.16.181:5026/npe_project";
	private static final String id = "jinyoung";
	private static final String pw = "jinyoung";
	
	protected Connection con;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	enum SQL {
		
		SELECT("select now()"),
		SELECT2("select * from tbl_keyword where username = ?");
		
		String value;
		
		SQL(String value) {
			this.value = value;
		}
	}

	public String getTime() throws Exception {
		
		Class.forName(MYSQL_JDBC_DRIVER_MYSQL_DRIVER);
//		Class.forName(ORG_APACHE_COMMONS_DBCP_POOLING_DRIVER);
//		String jdbcDrive = JDBC_APACHE_COMMONS_DBCP_POOL;	;
		
		this.con = DriverManager.getConnection(url, id, pw);

		pstmt = con.prepareStatement(SQL.SELECT.value);
				
		rs = pstmt.executeQuery();
		rs.next();
				
		String time = rs.getString(1);
		
		rs.close();
		pstmt.close();
		con.close();
		
		return time;
	}
	
	public LucVO getVO(final String username) throws Exception {
		
		final LucVO vo = new LucVO();
		
		new SqlAgent() {

			@Override
			protected void doJob() throws Exception {
				// TODO Auto-generated method stub
				pstmt = con.prepareStatement(SQL.SELECT2.value);
				pstmt.setString(1, username);
				
				rs = pstmt.executeQuery();
				rs.next();
				
				vo.setMno(rs.getInt(1));
				vo.setUsername(rs.getString(2));
				vo.setScore(rs.getInt(3));
				vo.setRegdate(rs.getDate(4));
				vo.setKeyword(rs.getString(5));
				
			}
			
		}.doExcute();
		return vo;
	}
	
	
}
