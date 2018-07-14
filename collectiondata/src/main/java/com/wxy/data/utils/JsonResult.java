package com.wxy.data.utils;

/**
 * Created with IntelliJ IDEA.
 * User: WangYN
 * Date: 2018/7/14
 * Time: 11:16
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class JsonResult {

    private String status;
   /* public String message;*/
    private Object result;



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}