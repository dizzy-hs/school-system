package com.dizzy.school.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dizzy.school.entity.SysUser;
import com.dizzy.school.mapper.SysUserMapper;
import com.dizzy.school.service.ISysUserService;

@Primary
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    
}
