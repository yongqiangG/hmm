package com.johnny.hm.controller;

import com.johnny.hm.bean.JObLevel;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.JobLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/job")
public class JobLevelController {
    @Autowired
    JobLevelService jobLevelService;
    @GetMapping("/")
    public List<JObLevel> getAllJobLevel(){
        return jobLevelService.getAllJobLevel();
    }
    @PostMapping("/")
    public RespBean postJobLevel(@RequestBody JObLevel jObLevel){
        if(jobLevelService.postJobLevel(jObLevel)==1){
            return RespBean.ok("新增成功");
        }
        return RespBean.err("新增失败");
    }
    @PutMapping("/")
    public RespBean putJobLevel(@RequestBody JObLevel jObLevel){
        if(jobLevelService.putJobLevel(jObLevel)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }
    @DeleteMapping("/")
    public RespBean delJobLevel(Integer[] ids){
        if(jobLevelService.delJobLevel(ids)==ids.length){
            return RespBean.ok("删除成功");
        }
        return RespBean.err("删除失败");
    }
}
