package com.loginUsers.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableDiscoveryClient
public class LoginUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginUsersApplication.class, args);
	}

}
