package com.dizzy.school.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dizzy.school.entity.SysPermission;
import com.dizzy.school.mapper.SysPermissionMapper;
import com.dizzy.school.service.ISysPermissionService;

@Primary
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements ISysPermissionService {
    
}
