package com.spring.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author:zl
 * @create_time: 2021/1/28
 */
@Service
public class CrTwo {

    @Autowired
    private CrOne crOne;

    @Async
    public void test(){

    }
}
