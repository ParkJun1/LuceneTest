package org.npe.lucene.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class SqlAgent {
	
	private static final String MYSQL_JDBC_DRIVER_MYSQL_DRIVER = "com.mysql.jdbc.Driver";
//	private static final String ORG_APACHE_COMMONS_DBCP_POOLING_DRIVER = "org.apache.commons.dbcp.PoolingDriver";
//	private static final String JDBC_APACHE_COMMONS_DBCP_POOL = "jdbc:apache:commons:dbcp:/pool";
	
	protected Connection con;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	private static final String url = "jdbc:mysql://61.72.16.181:5026/npe_project";
	private static final String id = "jinyoung";
	private static final String pw = "jinyoung";
	
	public final void doExcute() throws Exception {
		try {
			makeConnection();
			doJob();
		} catch (Exception e) {
			throw e;
		} finally {
			closeAll();
		}
	}
	
	private void makeConnection() throws Exception {
		Class.forName(MYSQL_JDBC_DRIVER_MYSQL_DRIVER);
//		Class.forName(ORG_APACHE_COMMONS_DBCP_POOLING_DRIVER);
//		String jdbcDrive = JDBC_APACHE_COMMONS_DBCP_POOL;
		
		this.con = DriverManager.getConnection(url, id, pw);	
	}
	
	protected abstract void doJob() throws Exception; 
	
	private void closeAll() {
		if(rs != null) try{ rs.close(); } catch(Exception e){};
		if(pstmt != null) try{ pstmt.close(); } catch(Exception e){};
		if(con != null) try{ con.close(); } catch(Exception e){};
	}
}
