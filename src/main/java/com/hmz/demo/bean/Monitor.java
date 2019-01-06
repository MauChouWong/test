package com.hmz.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ConfigurationProperties(prefix = "monitor")
public class Monitor {
//    @Value("${monitor.url}")
    private String[] url;
//    @Value("${monitor.mobiles}")
    private String[] mobiles;
//    @Value("${monitor.emails}")
    private String[] emails;

    public String[] getUrl() {
        return url;
    }

    public void setUrl(String[] url) {
        this.url = url;
    }

    public String[] getMobiles() {
        return mobiles;
    }

    public void setMobiles(String[] mobiles) {
        this.mobiles = mobiles;
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "url=" + Arrays.toString(url) +
                ", mobiles=" + Arrays.toString(mobiles) +
                ", emails=" + Arrays.toString(emails) +
                '}';
    }
}
