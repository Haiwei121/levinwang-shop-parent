package com.levinwang.base;

import com.levinwang.constants.Constants;

public class BaseApiService {
    public ResponseBase setResultSuccess(){
        return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, null);
    }

    public ResponseBase setResultSuccess(Object data){
        return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, data);
    }

    public ResponseBase setResultFail(String msg){
        return setResult(Constants.HTTP_RES_CODE_500, msg, null);
    }

    public ResponseBase setResult(Integer rtnCode, String rtnMsg, Object data){
        return new ResponseBase(rtnCode, rtnMsg, data);
    }
}
