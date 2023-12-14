package com.maguasoft.example.mock.service.impl;

import com.maguasoft.example.mock.service.OrderService;
import com.maguasoft.example.mock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    @Override
    public String getOrder(Long id) {
        return String.format("查询到 UserID=%s 的订单，OrderID = %s", userService.getUser(1L), id);
    }
}
