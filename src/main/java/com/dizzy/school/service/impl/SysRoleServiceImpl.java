package com.dizzy.school.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dizzy.school.entity.SysRole;
import com.dizzy.school.mapper.SysRoleMapper;
import com.dizzy.school.service.ISysRoleService;

@Primary
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {
    
}
