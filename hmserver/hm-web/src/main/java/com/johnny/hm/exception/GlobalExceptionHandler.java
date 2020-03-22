package com.johnny.hm.exception;

import com.johnny.hm.model.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SQLException.class)
    public RespBean SQLExceptionHandler(SQLException e){
        //外键异常
        if(e instanceof SQLIntegrityConstraintViolationException){
            return  RespBean.err("该数据已被引用,删除失败");
        }
        return RespBean.err("数据库异常,操作失败");
    }

}
