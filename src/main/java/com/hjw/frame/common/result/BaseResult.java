package com.hjw.frame.common.result;

import com.github.pagehelper.PageInfo;
import com.hjw.frame.common.consts.Consts;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用响应对象
 *
 * @param <T>
 */
@Setter
@Getter
@ToString
public class BaseResult<T> {

    private static final int SUCCESS_CODE = 0;
    private static final String SUCCESS_MESSAGE = "success";

    public static final int ERROR_CODE = 100;

    private int code;

    private String url;

    private String msg;

    private T data;
    
    public BaseResult(PageInfo<?> pageInfo){
        Map<String, Object> rspData = new HashMap<>();
        rspData.put("rows", pageInfo.getList());
        rspData.put("total", pageInfo.getTotal());
        this.code= Consts.SUCCESS;
        this.msg=SUCCESS_MESSAGE;
        this.data= (T) rspData;
    }

    public BaseResult(int code, String url, String msg, T data) {
        this.code = code;
        this.url = url;
        this.msg = msg;
        this.data = data;
    }

    public BaseResult() {
    }
}
