package com.hmz.demo.task;

import com.hmz.demo.bean.Monitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class ScheduledTask {
    @Autowired
    private Monitor monitor;
    private static Logger LOG = LoggerFactory.getLogger(ScheduledTask.class);
    @Scheduled(cron = "*/10 * * * * *")
    public void myTask(){
        LOG.info("定时器：" + new Date());
        if(monitor != null){
                LOG.info("monitors：" +monitor.toString());
        }else {
            LOG.info("monitors：null" );
        }
    }
}
