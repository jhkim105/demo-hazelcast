package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserServiceTest {
  @Autowired
  UserService userService;

  @Test
  public void getUser() {
    log.debug("{}", userService.getUser("user1"));
    log.debug("{}", userService.getUser("user1"));
    log.debug("{}", userService.getUser("user2"));
    log.debug("{}", userService.getUser("user2"));
  }
}