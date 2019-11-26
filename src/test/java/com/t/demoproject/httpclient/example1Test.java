package com.t.demoproject.httpclient;

import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;
import java.time.ZonedDateTime;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class example1Test {
    /**
     * 应用场景
     *   例:
     *      如获取某一状态
     *      通多
     *
     *
     */
    /*@Test
    public void restInitResponseEntityTest() {
        List<String> list=new ArrayList<>();
        list.add("test");
        ResponseEntity<List> responseEntity = VirgoRestExcu.restInitResponseEntityList(list, HttpStatus.OK);
        System.out.println(responseEntity.toString());
        System.out.println(responseEntity.getStatusCodeValue());
        System.out.println(Arrays.toString(responseEntity.getBody().toArray()));
    }

    *//**
     * 需要注意的是 请求头部的一些设置
     *//*
    @Test
    public void restGetHttpEntityTest() {
        HttpHeaders header = VirgoRestHeader.restGetHeaderByContentType();
        header.setDate(ZonedDateTime.now());
        header.setAccessControlRequestMethod(HttpMethod.GET);
        Map<String, Object> body=new HashMap<>();
        body.put("key","test");
        HttpEntity<Map<String, Object>> mapHttpEntity = VirgoRestExcu.restGetHttpEntity(body, header);
        System.out.println(mapHttpEntity.toString());
    }*/
}