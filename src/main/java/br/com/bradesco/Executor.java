package br.com.bradesco;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.bradesco.utils.LogUtils;
import br.com.bradesco.utils.Utils;

/**
 * Executor
 * 
 * @author Maciel
 *
 */
public class Executor {

	LogUtils logUtils = new LogUtils(Executor.class.getName());

	public static void main(String[] args) {
		Executor obj = new Executor();
		obj.run();
	}

	private void run() {
		logUtils.info("Iniciando execução de batch ");

		String[] springConfig = { "/spring/jobs/job-extract-transactions.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

		JobLauncher jobLauncher = (JobLauncher) context.getBean("JobLaucher");
		Job job = (Job) context.getBean("Bradescojob");
		JobExecution execution = null;
		try {

			JobParametersBuilder builder = new JobParametersBuilder();
			Utils utils = new Utils();

			builder.addString("DATA", utils.converteData("dd/mm/yyyy hh:mm:ss", new Date()));
			builder.addString("t_status", "0");
			logUtils.info("Parametros: " + builder.toJobParameters().getParameters().toString());
			execution = jobLauncher.run(job, builder.toJobParameters());

			logUtils.info("Exit Status : " + execution.getStatus());
			logUtils.info("Exit Status : " + execution.getAllFailureExceptions());

		} catch (Exception e) {
			logUtils.error("Error : " + e);
			logUtils.error("Exit Status : " + execution.getStatus());

		}

	}

}
