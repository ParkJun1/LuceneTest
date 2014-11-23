package org.npe.lucene.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;

public class LuceneControllerTest extends ControllerTest {

	@Test
	public void test() throws Exception {
		logger.info(this.mockMvc.toString());
		
		//perform�޼ҵ���� �������ְ� import static�� ���!
		//builder pattern���� ���!
		MvcResult result =
				mockMvc.perform(get("/luc/doA")).andReturn(); 
		
		logger.info(result.getModelAndView().getViewName());
	}
	
	@Test
	public void test2() throws Exception {
		logger.info(this.mockMvc.toString());
		
		//perform�޼ҵ���� �������ְ� import static�� ���!
		//builder pattern���� ���!
		MvcResult result =
				mockMvc.perform(get("/luc/start")).andExpect(status().isOk()).andReturn(); 
		
		logger.info(result.getModelAndView().getViewName());
	}
}
