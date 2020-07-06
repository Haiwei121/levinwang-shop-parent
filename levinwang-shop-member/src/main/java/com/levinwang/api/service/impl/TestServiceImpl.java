package com.levinwang.api.service.impl;

import com.levinwang.api.service.TestAPIService;
import com.levinwang.base.BaseApiService;
import com.levinwang.base.ResponseBase;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestServiceImpl extends BaseApiService implements TestAPIService {

    @Override
    public Map<String, Object> test(Integer id, String name) {
        Map<String, Object> rtnMap = new HashMap<String, Object>();
        rtnMap.put("rtnCode", "200");
        rtnMap.put("rtnMsg", "success");
        rtnMap.put("data", new String[]{"12345", id+"", name});
        return rtnMap;
    }

    @Override
    public ResponseBase testResponseBase() {
        return setResultSuccess();
    }


}
