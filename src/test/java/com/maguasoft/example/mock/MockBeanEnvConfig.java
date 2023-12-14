package com.maguasoft.example.mock;

import com.maguasoft.example.mock.service.UserService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"dev", "local", "test"})
public class MockBeanEnvConfig {

    @Bean
    @Primary
    public UserService mockUserService() {
        UserService userService = Mockito.spy(UserService.class);
        Mockito.when(userService.getUser(Mockito.anyLong())).thenReturn("Hello mock!!!!");
        return userService;
    }
}
