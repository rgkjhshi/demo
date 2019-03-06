--  用户表

CREATE TABLE `user_id_source` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000000000 DEFAULT CHARSET=utf8 COMMENT='用户的id生成表';

CREATE TABLE `user_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '用户唯一id',
  `nickname` varchar(20) NOT NULL DEFAULT '' COMMENT '用户昵称',
  `user_status` tinyint(5) unsigned NOT NULL DEFAULT '0' COMMENT '账号状态',
  `gender` tinyint(5) unsigned NOT NULL DEFAULT '0' COMMENT '性别,0:未知,1:男,2:女',
  `avatar_url` varchar(500) NOT NULL DEFAULT '' COMMENT '用户头像',
  `mobile` varchar(20) NOT NULL DEFAULT '' COMMENT '验证后的主手机号',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id` (`user_id`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户基本信息表';
