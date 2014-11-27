package org.npe.lucene.service;

import java.util.List;

import javax.inject.Inject;

import org.npe.lucene.mapper.LuceneMapper;
import org.npe.lucene.vo.DemoVO;
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
			//System.out.println("service~ : " + vo);
			mapper.insertVO(vo);
		}
		
		mapper.setScore();
		//mapper.deleteNull(vo.getUsername());
	}
	
	public String getMassage(String username) throws Exception {
		
		Integer score = mapper.getScore(username);
		
		List<DemoVO> scList = mapper.demo1(username);
		
		System.out.println("매칭된 기분 점수");
		for (DemoVO vo : scList) {
			System.out.println(vo);
		}
		
		System.out.println("계산된 평균 점수 : " + score);
		
		return mapper.getMsg(score);
	}
	
}
