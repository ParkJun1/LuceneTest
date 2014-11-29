package org.npe.lucene.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class LuceneControllerTest extends ControllerTest {

	@Test
	public void test() throws Exception {
		logger.info(this.mockMvc.toString());
		
		//perform占쌨소듸옙占쏙옙占� 占쏙옙占쏙옙占쏙옙占쌍곤옙 import static占쏙옙 占쏙옙占�!
		//builder pattern占쏙옙占쏙옙 占쏙옙占�!
		MvcResult result =
				mockMvc.perform(get("/luc/doA")).andReturn(); 
		
		logger.info(result.getModelAndView().getViewName());
	}
	
	@Test
	public void test2() throws Exception {
		logger.info(this.mockMvc.toString());
		
		//perform占쌨소듸옙占쏙옙占� 占쏙옙占쏙옙占쏙옙占쌍곤옙 import static占쏙옙 占쏙옙占�!
		//builder pattern占쏙옙占쏙옙 占쏙옙占�!
		MvcResult result =
				mockMvc.perform(get("/luc/start")).andExpect(status().isOk()).andReturn(); 
		
		logger.info(result.getModelAndView().getViewName());
	}
	
	@Test
	public void start() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.post("/luc/input")
				.param("username", "mock1")
				.param("massage", "오늘 기분이 짜증난다.")).andExpect(status().isOk());
	}
	
	@Test
	public void result() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.post("/luc/result")
				.param("username", "mock1")).andExpect(status().isOk());
			
	}
}
