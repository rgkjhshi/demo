package com.mk.demo.service.dao;

import com.mk.demo.service.domain.UserIdSource;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

/**
 * @author shisong
 * @since 2018-11-21
 */
@Mapper
public interface UserIdSourceDao {

    /**
     * 添加记录
     *
     * @param userIdSource 参数是为了回填id字段
     * @return 返回受影响的记录条数
     */
    @Insert("INSERT INTO user_id_source (id) VALUES (NULL);")
    @Options(keyColumn = "id", keyProperty = "id", useGeneratedKeys = true)
    int add(UserIdSource userIdSource);

    UserIdSource queryOne(UserIdSource userIdSource);

    List<UserIdSource> queryList(UserIdSource userIdSource);
}
