package br.com.ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsContaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsContaApplication.class, args);
	}

}
