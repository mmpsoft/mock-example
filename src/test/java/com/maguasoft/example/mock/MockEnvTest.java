package com.maguasoft.example.mock;

import com.maguasoft.example.mock.service.OrderService;
import com.maguasoft.example.mock.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles({"dev", "local", "test"})
public class MockEnvTest {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Test
    public void test() {
        System.out.println(orderService.getOrder(1L));
        System.out.println(userService.getUser(1L));
    }
}
