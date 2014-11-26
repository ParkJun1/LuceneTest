package org.npe.lucene.service;

import javax.inject.Inject;

import org.npe.lucene.mapper.LuceneMapper;
import org.npe.lucene.vo.LucVO;
import org.springframework.stereotype.Service;

@Service("LuceneService")
public class LuceneService {
	
	@Inject
	LuceneMapper mapper;

//	public BbsVO getTest() throws Exception {
//		return mapper.getBookTest();
//	}
	
	public void insertVO(LucVO vo) throws Exception {
		
		for(String word : vo.getWordList()) {
			vo.setKeyword(word);
			System.out.println("service~ : " + vo);
			mapper.insertVO(vo);
		}
		
		mapper.setScore();
		mapper.deleteNull(vo.getUsername());
	}
	
	public String getMassage(String username) throws Exception {
		
		Integer score = mapper.getScore(username);
		
		System.out.println("점수 : " + score);
		
		return mapper.getMsg(score);
	}
	
}
