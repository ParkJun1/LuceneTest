package org.npe.lucene.web;

import java.util.List;

import javax.inject.Inject;

import org.apache.lucene.analysis.ko.KoreanAnalyzer;
import org.apache.lucene.analysis.ko.morph.WordSegmentAnalyzer;
import org.npe.lucene.service.LuceneService;
import org.npe.lucene.util.AnalyzerUtils;
import org.npe.lucene.vo.LucVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("LuceneController")
@RequestMapping("/luc/*")
public class LuceneController {
	
	@Inject
	LuceneService service;
	
	private static Logger logger = LoggerFactory.getLogger(LuceneController.class);
	
	private static final KoreanAnalyzer koAnalyzer = new KoreanAnalyzer();
	private static final WordSegmentAnalyzer wsAnalyer = new WordSegmentAnalyzer();
	
	@RequestMapping("/doA")
	public void doA() {
		logger.info("doA.................");
		System.out.println("doA..............");
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String start() throws Exception {
		return "lucene/start";
	}
	
	@RequestMapping(value="/input", method=RequestMethod.POST)
	public String input(LucVO vo, String massage) throws Exception {
		
		vo.setWordList(AnalyzerUtils.displayTokens(koAnalyzer, massage));
		
		System.out.println("LuceneController input....." + vo);
		
		service.insertVO(vo);
		
		return "lucene/result";
	}
	
	@RequestMapping(value="/result", method=RequestMethod.POST, produces="text/html;charset=UTF-8")
	public @ResponseBody String result(String username, Model model) throws Exception {
		
		System.out.println("LuceneController result....." + username);
		
		String massage = service.getMassage(username);
		
		logger.info(massage);
		
		return massage;
	}

}
