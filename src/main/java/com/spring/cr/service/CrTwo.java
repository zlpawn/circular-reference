package com.spring.cr.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author:zl
 * @create_time: 2021/1/28
 */
@Service
@Lazy
public class CrTwo {

    private CrOne crOne;

    public CrTwo(CrOne crOne){
        this.crOne = crOne;
    }

    public void test(){

    }
}
