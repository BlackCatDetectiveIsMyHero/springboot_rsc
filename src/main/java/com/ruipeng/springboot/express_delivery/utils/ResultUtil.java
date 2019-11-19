package com.ruipeng.springboot.express_delivery.utils;

import com.ruipeng.springboot.express_delivery.po.Result;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.utils.ResultUtil
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-18 00:16
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
