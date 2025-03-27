package com.dizzy.school.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dizzy.school.entity.SysUser;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}
