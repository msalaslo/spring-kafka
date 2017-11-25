package com.msl.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.msl.kafka.producer.service.Producer;

@SpringBootApplication
public class SpringKafkaApplication implements CommandLineRunner {
	
	@Autowired
	private Producer producer;

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enviando mensaje....");
		producer.sendMessage("Hola desde spring");
		System.out.println("Mensaje enviado..");
	}
}
