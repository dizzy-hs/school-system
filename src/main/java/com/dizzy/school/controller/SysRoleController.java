package com.dizzy.school.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dizzy.school.entity.SysRole;
import com.dizzy.school.service.ISysRoleService;
import com.dizzy.school.utils.Result;

@RestController
@RequestMapping(value = "/sys/roles")
public class SysRoleController {
    private final ISysRoleService roleService;

    public SysRoleController(ISysRoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping(value = "")
    public Result<Boolean> insert(@RequestBody SysRole obj) {
        return Result.success(roleService.save(obj));
    }

    @DeleteMapping(value = "/{id}")
    public Result<Boolean> delete(@PathVariable("id") Long id) {
        return Result.success(roleService.removeById(id));
    }

    @PatchMapping(value = "")
    public Result<Boolean> update(@RequestBody SysRole obj) {
        return Result.success(roleService.updateById(obj));
    }

    @GetMapping(value = "/{id}")
    public Result<SysRole> find(@PathVariable("id") Long id) {
        return Result.success(roleService.getById(id));
    }
}
