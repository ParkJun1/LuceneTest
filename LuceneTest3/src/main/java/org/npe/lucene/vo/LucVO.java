package org.npe.lucene.vo;

import java.sql.Date;
import java.util.List;

public class LucVO {

//	mno number,
//	username varchar2(50),
//	score number,
//	regdate date default sysdate,
//	keyword varchar2(200)
	
	private Integer mno;
	private String username;
	private Integer score;
	private Date regdate;
	private String keyword;
	
	private List<String> wordList;
	
	public List<String> getWordList() {
		return wordList;
	}
	public void setWordList(List<String> wordList) {
		this.wordList = wordList;
	}
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "LucVO [username=" + username + ", wordList=" + wordList + "]";
	}
	
	
}
