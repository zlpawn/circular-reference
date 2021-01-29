package com.spring.cr;

import com.spring.cr.service.CrOne;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CircularReferenceApplicationTests {

    @Autowired
    private CrOne crOne;

    @Test
    void contextLoads() {
        crOne.test();
    }

}
