package com.maguasoft.example.mock.service.impl;

import com.maguasoft.example.mock.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUser(Long id) {
        return String.format("查询 UserID = %s", id);
    }
}
