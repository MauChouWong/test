package com.hmz.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.hmz.demo.common.ResultService;
import com.hmz.demo.common.ServiceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController
public class DemoController {
    private static Logger LOG = LoggerFactory.getLogger(DemoController.class);
    @RequestMapping("api")
    public String api(HttpServletRequest request){
        try { //测试一下git,来自test的修改
            String params = readStreamParameter(request.getInputStream());
            LOG.info("params:"+params);
            JSONObject json = JSONObject.parseObject(params);
            String type = json.getString("msg_type");
            ResultService service = ServiceFactory.getService(type);
            return service.result(json);
        } catch (Exception e) {
            LOG.info("api异常", e);
        }
        return "error";
    }
    private static String readStreamParameter(ServletInputStream in) {
        StringBuilder buffer = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != reader) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return buffer.toString();
    }

    @RequestMapping("rurl")
    public void redirectUrl(HttpServletResponse response) throws Exception{
        String form = "<script>alert('自动执行，弹出信息')</script>";
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(form);//直接将完整的表单html输出到页面
        response.getWriter().flush();
        response.getWriter().close();
    }
}
