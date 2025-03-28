package com.dizzy.school.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dizzy.school.entity.SysPermission;
import com.dizzy.school.service.ISysPermissionService;
import com.dizzy.school.utils.Result;

@RestController
@RequestMapping(value = "/sys/permissions")
public class SysPermissionController {
    private final ISysPermissionService sysPermissionService;
    
    public SysPermissionController(ISysPermissionService sysPermissionService) {
        this.sysPermissionService = sysPermissionService; 
    }

    @PostMapping(value = "")
    public Result<Boolean> insert(@RequestBody SysPermission obj) {
        return Result.success(sysPermissionService.save(obj));
    }

    @DeleteMapping(value = "/{id}")
    public Result<Boolean> delete(@PathVariable("id") Long id) {
        return Result.success(sysPermissionService.removeById(id)); 
    }

    @PatchMapping(value = "")
    public Result<Boolean> update(@RequestBody SysPermission obj) {
        return Result.success(sysPermissionService.updateById(obj));
    }

    @GetMapping(value = "/{id}")
    public Result<SysPermission> find(@PathVariable("id") Long id) {
        return Result.success(sysPermissionService.getById(id));
    }
}
