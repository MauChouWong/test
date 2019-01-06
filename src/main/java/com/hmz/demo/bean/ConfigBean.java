package com.hmz.demo.bean;

import org.springframework.beans.factory.annotation.Value;

public class ConfigBean {
    @Value("${monitors.url}")
    public static String url;
}
