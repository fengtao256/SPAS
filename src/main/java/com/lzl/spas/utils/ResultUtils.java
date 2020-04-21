package com.lzl.spas.utils;

import java.util.HashMap;
import java.util.Map;

public class ResultUtils {

    //响应业务状态
    private Integer code ;

    //响应信息
    private String msg ;

    //响应信息
    private String data ;
    //默认成功返回集
    public static Map<String , Object> success(){
        Map<String,Object> retMap = new HashMap<String,Object>() ;
        retMap.put("code", 200);
        retMap.put("msg", "OK");
        retMap.put("data", "操作成功！");
        return retMap ;
    }
    //默认失败的返回集
    public static Map<String , Object> error(){
        Map<String,Object> retMap = new HashMap<String,Object>() ;
        retMap.put("code", 1001);
        retMap.put("msg", "ERROR");
        retMap.put("data", "操作失败！");
        return retMap ;
    }
    //自定义返回集
    public static Map<String , Object> setResult(Integer code,String msg,String data){
        Map<String,Object> retMap = new HashMap<String,Object>() ;
        retMap.put("code", code);
        retMap.put("msg", msg);
        retMap.put("data", data);
        return retMap ;
    }
}
