package org.npe.lucene.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.npe.lucene.service.LuceneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/**/*-context.xml"})
public class ServiceTest {

	private static Logger logger = LoggerFactory.getLogger(ServiceTest.class);
	
	@Resource(name="LuceneService")
	LuceneService service;
	
	@Test
	public void test() {
		//System.out.println(service.getTest());
	}
}
