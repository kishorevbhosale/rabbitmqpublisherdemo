package com.rabbitmqpublisher.rabbitmqpublisherdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqpublisherdemoApplication implements CommandLineRunner{

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqpublisherdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleMessage simpleMessage = new SimpleMessage();
		simpleMessage.setName("Kishor");
		simpleMessage.setDescription("spring rabbitmq description");
		rabbitTemplate.convertAndSend("TestExchange", "testRouting", simpleMessage);
		//rabbitTemplate.convertAndSend("TestExchange", "testRouting", "simple description...");
	}
}
