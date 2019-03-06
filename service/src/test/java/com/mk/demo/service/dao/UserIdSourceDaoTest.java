package com.mk.demo.service.dao;

import com.mk.demo.service.BaseTest;
import com.mk.demo.service.domain.UserIdSource;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shisong
 * @since 2019-03-06
 */
public class UserIdSourceDaoTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(UserIdSourceDaoTest.class);

    @Resource
    private UserIdSourceDao userIdSourceDao;

    @Test
    public void add() {
        UserIdSource userIdSource = new UserIdSource();
        userIdSourceDao.add(userIdSource);
        logger.info("生成的自增id={}", userIdSource.getId());
    }

    @Test
    public void queryOne() {
        UserIdSource UserIdSource = userIdSourceDao.queryOne(new UserIdSource());
        logger.info("UserIdSource={}", UserIdSource);
    }

    @Test
    public void queryList() {
        UserIdSource userIdSource = new UserIdSource();
        List<UserIdSource> list = userIdSourceDao.queryList(userIdSource);
        logger.info("list={}", list);
    }
}