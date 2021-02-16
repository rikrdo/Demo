package com.my.demo.test;

import com.my.demo.controller.WebController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(WebController.class)
public class TestingWebApplicationTests {
    @Autowired
    private WebController controller;

    @Test
    public void testSum() throws Exception {
        Assert.assertEquals( controller.sumaTest(2,2),4);
    }
}
