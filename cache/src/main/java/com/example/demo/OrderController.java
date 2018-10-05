package com.example.demo;

import com.example.demo.common.model.Order;
import com.example.demo.common.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

  private final OrderRepository orderRepository;

  @GetMapping("/orders/{id}")
  public Order get(@PathVariable Long id) {
    return orderRepository.findById(id).get();
  }
}
