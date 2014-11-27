package org.npe.lucene.vo;

public class DemoVO {
	
	private String keyword;
	private String score;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "[keyword=" + keyword + ", score=" + score + "]";
	}
	
	
}
