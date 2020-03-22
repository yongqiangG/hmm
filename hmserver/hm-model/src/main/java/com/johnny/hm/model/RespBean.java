package com.johnny.hm.model;

public class RespBean {
    private Integer status;
    private String msg;
    private Object obj;
    public RespBean(){
    }

    public RespBean(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    public Integer getStatus() {
        return status;
    }
    //ok
    public static RespBean ok(String msg){
        return new RespBean(200,msg,null);
    }
    public static RespBean ok(String msg,Object obj){
        return new RespBean(200,msg,obj);
    }
    //error
    public static RespBean err(String msg){
        return new RespBean(500,msg,null);
    }
    public static RespBean err(String msg,Object obj){
        return new RespBean(500,msg,obj);
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
