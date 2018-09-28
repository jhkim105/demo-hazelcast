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
public class OrderRepositoryTest {

  @Autowired
  OrderRepository orderRepository;


  @Test
  public void test() {
    log.debug("{}", orderRepository.findById(1L).get());
    log.debug("{}", orderRepository.findById(1L).get());
    log.debug("{}", orderRepository.findById(1L).get());
    log.debug("{}", orderRepository.findById(1L).get());
  }

}