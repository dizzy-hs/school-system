package com.dizzy.school.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dizzy.school.entity.SysUser;
import com.dizzy.school.service.ISysUserService;
import com.dizzy.school.utils.Result;

@RestController
@RequestMapping(value = "/sys/users")
public class SysUserController {
    private final ISysUserService sysUserService;

    public SysUserController(ISysUserService sysUserService) {
        this.sysUserService = sysUserService; 
    }
    
    @PostMapping(value = "")
    public Result<Boolean> insert(SysUser obj) {
        return Result.success(sysUserService.save(obj));
    }
}
