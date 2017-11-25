package com.msl.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.msl.kafka.producer.service.Producer;

@RestController
@RequestMapping("/producer")
public class ProducerController {

	@Autowired
	private Producer producer;
	
	@RequestMapping("send")
	public String send(@RequestParam String msg) {
		producer.sendMessage(msg);
		return "sent";
	}
}
