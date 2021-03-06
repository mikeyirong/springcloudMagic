package com.mikespider.springcloudMagic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class App {
	 @Value("${config.name}")
	  String name = "World";

	  @RequestMapping("/")
	  public String home() {
	    return "Hello " + name;
	  }

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
