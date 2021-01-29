package com.spring.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author:zl
 * @create_time: 2021/1/28
 */
@Service
public class CrOne {

    @Autowired
    private CrTwo crTwo;

    @Async
    //@Transactional
    public void test(){

    }
}
