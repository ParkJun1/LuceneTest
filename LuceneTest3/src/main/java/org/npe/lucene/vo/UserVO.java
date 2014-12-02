package org.npe.lucene.vo;

import java.sql.Date;

public class UserVO {
	
	private String user_id;
	private String password;
	private String email;
	private String phone_num;
	private String reg_id;
	private Integer avg_score;
	private String msg_type;
	private Date regdate;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public Integer getAvg_score() {
		return avg_score;
	}
	public void setAvg_score(Integer avg_score) {
		this.avg_score = avg_score;
	}
	public String getMsg_type() {
		return msg_type;
	}
	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "UserVO [user_id=" + user_id + ", password=" + password
				+ ", email=" + email + ", phone_num=" + phone_num + ", reg_id="
				+ reg_id + ", avg_score=" + avg_score + ", msg_type="
				+ msg_type + ", regdate=" + regdate + "]";
	}
	
	
	
}
