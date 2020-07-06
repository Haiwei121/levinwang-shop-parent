package com.levinwang.api.service;

import com.levinwang.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/member")
public interface TestAPIService {
    @RequestMapping("/test")
    public Map<String, Object> test(Integer id, String name);

    @RequestMapping("/testResponseBase")
    public ResponseBase testResponseBase();
}
