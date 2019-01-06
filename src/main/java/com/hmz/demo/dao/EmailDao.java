package com.hmz.demo.dao;

import com.hmz.demo.bean.RecordEmail;
import com.hmz.demo.bean.TbRecordEmail;
import com.hmz.demo.bean.TbUserSns;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmailDao extends JpaRepository<TbRecordEmail, Integer> {

//    @Query("select email from TbRecordEmail email join email.userSns sns where sns.userSnsId=?1")
//    List<TbRecordEmail> findBySnsId(int snsId);

//    @Query("select email from TbUserSns sns join sns.recordEmail email where sns.userSnsId=?1")
//    List<TbRecordEmail> findBySnsId(int snsId);

    @Query(nativeQuery = true, value = "SELECT email.* FROM tb_record_email email JOIN hcc_tb_user_sns sns ON email.email_id=sns.user_id AND sns.user_sns_id=?1")
    List findList(int snsId);

}
