package com.microservice.authentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@Configuration
public class SessionConfig {
	@Bean
	public static ConfigureRedisAction configureRedisAction() {
	return ConfigureRedisAction.NO_OP;
	}
}
