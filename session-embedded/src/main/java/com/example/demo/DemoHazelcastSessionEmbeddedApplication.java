package com.example.demo;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapAttributeConfig;
import com.hazelcast.config.MapIndexConfig;
import com.hazelcast.config.SerializerConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.hazelcast.HazelcastSessionRepository;
import org.springframework.session.hazelcast.PrincipalNameExtractor;
import org.springframework.session.hazelcast.config.annotation.web.http.EnableHazelcastHttpSession;
import org.springframework.util.SocketUtils;

@Slf4j
@SpringBootApplication
@EnableCaching
public class DemoHazelcastSessionEmbeddedApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoHazelcastSessionEmbeddedApplication.class, args);
  }

//  @Configuration
//  @EnableHazelcastHttpSession
//  static class HazelcastSessionConfig {
//
//    @Bean(destroyMethod = "shutdown")
//    public HazelcastInstance hazelcastInstance() {
//      Config config = new Config();
//      int port = SocketUtils.findAvailableTcpPort();
//      config.getNetworkConfig().setPort(port);
//      log.info("Hazelcast port #: {}", port);
//
//      MapAttributeConfig attributeConfig = new MapAttributeConfig()
//          .setName(HazelcastSessionRepository.PRINCIPAL_NAME_ATTRIBUTE)
//          .setExtractor(PrincipalNameExtractor.class.getName());
//
//      config.getMapConfig(HazelcastSessionRepository.DEFAULT_SESSION_MAP_NAME)
//          .addMapAttributeConfig(attributeConfig)
//          .addMapIndexConfig(new MapIndexConfig(
//              HazelcastSessionRepository.PRINCIPAL_NAME_ATTRIBUTE, false));
//
//      return Hazelcast.newHazelcastInstance(config);
//    }
//
//  }
}
