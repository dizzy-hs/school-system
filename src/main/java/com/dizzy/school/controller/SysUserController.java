package com.dizzy.school.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Result<Boolean> insert(@RequestBody SysUser obj) {
        return Result.success(sysUserService.save(obj));
    }

    @DeleteMapping(value = "/{id}")
    public Result<Boolean> delete(@PathVariable("id") Long id) {
        return Result.success(sysUserService.removeById(id));
    }

    @PatchMapping(value = "")
    public Result<Boolean> update(@RequestBody SysUser obj) {
        return Result.success(sysUserService.updateById(obj)); 
    }

    @GetMapping(value = "/{id}")
    public Result<SysUser> find(@PathVariable("id") Long id) {
        return Result.success(sysUserService.getById(id));
    }
}
