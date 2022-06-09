package ru.pashintsev.TestAB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class TestAbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAbApplication.class, args);
	}

}
