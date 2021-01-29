package com.spring.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author:zl
 * @create_time: 2021/1/28
 */
@Service
public class CrOne {

    @Autowired
    private CrTwo crTwo;

//    public CrOne(CrTwo crTwo){
//        this.crTwo = crTwo;
//    }

    @PostConstruct
    public void pawn(){
        System.err.println(123);
    }

    @Async
    //@Transactional
    public void test(){

    }
}
