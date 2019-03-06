package com.mk.demo.service;

import com.google.common.base.Charsets;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * 单元测试基础类
 *
 * @author song.shi
 * @since 2018-01-17
 */
public class UnitTest {
    private static final Logger logger = LoggerFactory.getLogger(UnitTest.class);

    @Test
    public void test() {
        logger.info("测试基累正确执行，不要改");
    }

    @Test
    public void testDateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2018-08-20 12:00:01", dateTimeFormatter);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        // 时间戳转LocalDateTime
        System.out.println(LocalDateTime.ofInstant(Instant.ofEpochSecond(1548078606), ZoneId.systemDefault()));
    }


    @Test
    public void testToken() {
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTk4NDMxOTYsImlhdCI6MTU1MTIwMzE5NiwidXNlcklkIjoxMDAwMDAwMDA2fQ.HkXG-YDl_y3gmbSETz4lEGTfMLjF_HOsciKySA3B_O0";
        String str = new String(Base64.getDecoder().decode("eyJleHAiOjE1NTk4NDMxOTYsImlhdCI6MTU1MTIwMzE5NiwidXNlcklkIjoxMDAwMDAwMDA2fQ"), Charsets.UTF_8);
        System.out.println(str);
    }
}