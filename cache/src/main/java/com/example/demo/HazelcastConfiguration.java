package com.example.demo;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import org.springframework.context.annotation.Bean;

//@Configuration
public class HazelcastConfiguration {

  @Bean
  public Config hazelCastConfig() {
    return new Config()
        .setInstanceName("hazelcast-instance")
        .addMapConfig(
            new MapConfig()
                .setName("users")
                .setMaxSizeConfig(new MaxSizeConfig(200, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
                .setEvictionPolicy(EvictionPolicy.LRU)
                .setTimeToLiveSeconds(20));
  }
}
