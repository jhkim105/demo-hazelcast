package com.example.demo;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.MapSession;
import org.springframework.session.Session;
import org.springframework.session.hazelcast.config.annotation.web.http.EnableHazelcastHttpSession;

@SpringBootApplication
@EnableHazelcastHttpSession
public class DemoHazelcastSessionApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoHazelcastSessionApplication.class, args);
  }

  @Configuration
  @EnableHazelcastHttpSession
  static class HazelcastSessionConfig {

    @Bean
    public HazelcastInstance hazelcastInstance() {
      ClientConfig clientConfig = new ClientConfig();
      clientConfig.getNetworkConfig().addAddress("52.78.120.160:5701");
      clientConfig.getUserCodeDeploymentConfig().setEnabled(true)
          .addClass(Session.class).addClass(MapSession.class)
          .addClass(org.springframework.session.hazelcast.SessionUpdateEntryProcessor.class);
      return HazelcastClient.newHazelcastClient(clientConfig);
    }

  }
}
