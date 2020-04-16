package com.mitocode.batch;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

@Component
public class AsistenciaJobListener extends JobExecutionListenerSupport {
	
	private static final Logger LOG = LoggerFactory.getLogger(AsistenciaJobListener.class);

	@Override
	public void afterJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			LOG.info("FINALIZO EL JOB!!");
		}
	}
}
