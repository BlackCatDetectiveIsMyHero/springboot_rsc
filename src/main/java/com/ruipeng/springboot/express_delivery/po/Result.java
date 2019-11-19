package com.ruipeng.springboot.express_delivery.po;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.po.Result
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-18 00:04
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
