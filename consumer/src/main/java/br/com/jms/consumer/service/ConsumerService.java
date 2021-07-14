package br.com.jms.consumer.service;

import br.com.jms.consumer.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.io.ObjectInputStream;

@Component
@Slf4j
public class ConsumerService {

	@Autowired
	RabbitTemplate rabbitTemplate;

	@RabbitHandler
	@RabbitListener(queues = "${queue.order.name}")
	public void receive(@Payload User user){
		log.info("User received: " + user);
	}

}
