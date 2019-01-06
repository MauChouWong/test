package com.hmz.demo.common;

import com.alibaba.fastjson.JSONObject;

public interface ResultService {
    public String result(JSONObject paramJson);
    public String verify(JSONObject paramJson);
}
