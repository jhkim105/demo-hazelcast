package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@CacheConfig(cacheNames = "users")
public class UserService {

  @Autowired
  private UserRepository userRepository;

  @Cacheable(condition = "#name.equals('user1')")
  public User getUser(String name) {
    User user =  userRepository.findByName(name);
    user.setRetrieveDate(new Date());
    return user;
  }


  @CacheEvict(allEntries = true)
  public void clearCache() {}
}
