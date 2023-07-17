//package com.example.springbatchtutorial.core.scheduler;
//
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.JobParameter;
//import org.springframework.batch.core.JobParameters;
//import org.springframework.batch.core.JobParametersInvalidException;
//import org.springframework.batch.core.launch.JobLauncher;
//import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
//import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
//import org.springframework.batch.core.repository.JobRestartException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.Collections;
//
//@Component
//public class sampleScheduler {
//
//    @Autowired
//    private Job trMigrationJob;
//
//    @Autowired
//    private JobLauncher jobLauncher;

//    @Scheduled(cron = "*/20 * * * * *")
//    public void helloWorldJobRun() throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException, JobRestartException {
//
//        JobParameters jobParameters = new JobParameters(
//                Collections.singletonMap("requestTime", new JobParameter(System.currentTimeMillis()))
//        );
//
//        jobLauncher.run(trMigrationJob, jobParameters);
//    }
//}
