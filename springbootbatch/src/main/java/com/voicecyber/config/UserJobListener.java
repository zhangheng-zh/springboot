package com.voicecyber.config;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * Created by Sean on 2018/8/6
 *joB 监视器 对job的状态以及异常的处理
 * @author Sean
 */
public class UserJobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("开始处理任务");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("任务处理结束");
    }
}
