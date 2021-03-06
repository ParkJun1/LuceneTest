package org.npe.lucene.bat;

import javax.inject.Inject;

import org.npe.lucene.dao.BatchDAO;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class CronQuartz2 extends QuartzJobBean {
	
	//일반적인 클래스로 동작하기 때문에 Inject 사용 불가............
//	@Inject
//	BatchMapper mapper;
	
//	private BatchService service;
	
/*	public void setBatchService(BatchService service) {
		this.service = service;
	}*/
	
	private BatchDAO dao = new BatchDAO();
	
	@Override
	protected void executeInternal(JobExecutionContext jobContext) throws JobExecutionException {
        try {
        	//System.out.println("5초 주기로 Quartz실행  : " + dao.getVO("user03"));
        	System.out.println("5초 주기로 Quartz실행  : " + dao.getTime());
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
