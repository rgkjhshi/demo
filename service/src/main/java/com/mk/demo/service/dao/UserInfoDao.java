package com.mk.demo.service.dao;


import com.mk.demo.service.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author shisong
 * @since 2018-11-26
 */
@Mapper
public interface UserInfoDao {

    /**
     * 添加记录
     *
     * @param userInfo 数据库实体
     * @return 返回受影响的记录条数
     */
    int add(UserInfo userInfo);

    /**
     * 通过主键id更新
     *
     * @param userInfo 数据库实体
     * @return 返回受影响的记录条数
     */
    int updateById(UserInfo userInfo);

    /**
     * 查询一条记录, 自行控制条件保证返回一条记录
     *
     * @param userInfo 实体的非空属性会做为查询条件
     * @return 查询到的结果, 无结果将返回null
     */
    UserInfo queryOne(UserInfo userInfo);

    /**
     * 查询多条记录, 自行控制条件保证返回多条记录
     *
     * @param userInfo 实体的非空属性会作为查询条件
     * @return 查询到的结果, 无结果将返回空List
     */
    List<UserInfo> queryList(UserInfo userInfo);
}
