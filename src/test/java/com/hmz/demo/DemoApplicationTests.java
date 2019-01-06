package com.hmz.demo;

import com.alibaba.fastjson.JSON;
import com.hmz.demo.bean.ConfigBean;
import com.hmz.demo.bean.Monitor;
import com.hmz.demo.bean.RecordEmail;
import com.hmz.demo.bean.TbRecordEmail;
import com.hmz.demo.dao.EmailDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    EmailDao emailDao;
    @Autowired
    Monitor monitor;
    @Test
    public void contextLoads() {
//        TbRecordEmail email = new TbRecordEmail();
//        email.setEmailSubject("主题-1");
//        email.setEmailText("内容-1");
//        email.setEmailToAddrs("huangmz@uhuibao.com");
//        email.setCreateTime(new Date());
//        emailDao.save(email);
        System.out.println(monitor);
        System.out.println(monitor.getEmails().length);
    }

    @Test
    public void getEmailList(){
        List list = emailDao.findList(494);
        System.out.println(JSON.toJSON(list));
    }

    @Test
    public void getPageEmail(){
        Pageable pageable = PageRequest.of(0,2);
        Page<TbRecordEmail> page = emailDao.findAll(pageable);
        System.out.println(JSON.toJSON(page));
    }

}
