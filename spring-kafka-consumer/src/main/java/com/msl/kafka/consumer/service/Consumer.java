package com.msl.kafka.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
	
	public String consume() {
		return "ok";
	}
	
	@KafkaListener(topics = "${kafka.topic.name}")
	public void listen(String message) {
		logger.info("Mensaje recibido: " + message);
	}
}
