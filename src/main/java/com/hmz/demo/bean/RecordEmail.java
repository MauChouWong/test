package com.hmz.demo.bean;

import javax.persistence.*;
import java.util.Date;

//@Entity
//@Table(name = "tb_record_email")
public class RecordEmail {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "email_id")
    private Integer emailId;
//    @Column(name = "email_subject")
    private String emailSubject;
//    @Column(name = "email_text")
    private String emailText;
//    @Column(name = "email_to_addrs")
    private String emailToAddrs;
//    @Column(name = "email_copy_addrs")
    private String emailCopyAddrs;
//    @Column(name = "create_time")
    private Date createTime;


    public Integer getEmailId() {
        return emailId;
    }
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id", referencedColumnName = "email_id", insertable = false, updatable = false)
//    private Set<TbUserSns> userSns = new HashSet<TbUserSns>();

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }

    public String getEmailToAddrs() {
        return emailToAddrs;
    }

    public void setEmailToAddrs(String emailToAddrs) {
        this.emailToAddrs = emailToAddrs;
    }

    public String getEmailCopyAddrs() {
        return emailCopyAddrs;
    }

    public void setEmailCopyAddrs(String emailCopyAddrs) {
        this.emailCopyAddrs = emailCopyAddrs;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

//    public Set<TbUserSns> getUserSns() {
//        return userSns;
//    }
//
//    public void setUserSns(Set<TbUserSns> userSns) {
//        this.userSns = userSns;
//    }
}
