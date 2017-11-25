package com.msl.kafka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.msl.kafka.consumer.service.Consumer;

@SpringBootApplication
public class SpringKafkaConsumerApplication implements CommandLineRunner {
	
	@Autowired
	private Consumer consumer;

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaConsumerApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Recibiendo mensaje....");
		String msg = consumer.consume();
		System.out.println("Mensaje recibido" + msg);
	}
}
