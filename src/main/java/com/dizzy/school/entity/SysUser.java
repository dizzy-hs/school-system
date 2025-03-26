package com.dizzy.school.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
CREATE TABLE `sys_user` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` VARCHAR(50) NOT NULL COMMENT '用户名',
  `password` VARCHAR(100) NOT NULL COMMENT '密码',
  `is_valid` TINYINT UNSIGNED NOT NULL DEFAULT 1 COMMENT '是否有效; 0-无效; 1-有效',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` TINYINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否删除; 0-未删除; 1-已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_username` (`username`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户表';
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user")
public class SysUser {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String username;
    private String password;
    private Boolean isValid;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    @TableLogic
    private Boolean isDeleted;
}
