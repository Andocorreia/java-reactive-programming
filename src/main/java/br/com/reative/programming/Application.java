package br.com.reative.programming;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("br.com.reative.programming")
public class Application {
	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
