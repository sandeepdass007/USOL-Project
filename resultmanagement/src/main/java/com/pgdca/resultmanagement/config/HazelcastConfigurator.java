package com.pgdca.resultmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionConfig;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.JoinConfig;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizePolicy;
import com.hazelcast.config.NetworkConfig;

@Configuration
public class HazelcastConfigurator {

	@Bean
	public Config hazelcastConfig() {
		Config config = new Config();
		config.addMapConfig(
				new MapConfig("publiccharts")
						.setEvictionConfig(new EvictionConfig().setEvictionPolicy(EvictionPolicy.LRU)
								.setMaxSizePolicy(MaxSizePolicy.FREE_HEAP_SIZE).setSize(10))
						.setTimeToLiveSeconds(2000));
		config.addMapConfig(
				new MapConfig("studentcharts")
						.setEvictionConfig(new EvictionConfig().setEvictionPolicy(EvictionPolicy.LRU)
								.setMaxSizePolicy(MaxSizePolicy.FREE_HEAP_SIZE).setSize(1000))
						.setTimeToLiveSeconds(120));
		NetworkConfig network = config.getNetworkConfig();
		network.setPort(5701).setPortCount(20);
		network.setPortAutoIncrement(true);
		JoinConfig join = network.getJoin();
		join.getMulticastConfig().setEnabled(false);
		join.getTcpIpConfig().addMember("localhost").setEnabled(true);
		return config;
	}

}
