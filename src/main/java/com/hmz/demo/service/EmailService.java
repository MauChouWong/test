package com.hmz.demo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hmz.demo.bean.TbRecordEmail;
import com.hmz.demo.common.ResultService;
import com.hmz.demo.dao.EmailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("emailService")
public class EmailService implements ResultService {
    @Autowired
    EmailDao emailDao;
    @Override
    public String result(JSONObject paramJson) {
        List<TbRecordEmail> emails = emailDao.findAll();
        return JSON.toJSONString(emails);
    }

    @Override
    public String verify(JSONObject paramJson) {
        return null;
    }
}
