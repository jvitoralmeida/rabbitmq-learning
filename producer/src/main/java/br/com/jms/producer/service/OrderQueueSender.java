package br.com.jms.producer.service;

import br.com.jms.producer.model.User;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderQueueSender {

  @Autowired private RabbitTemplate rabbitTemplate;

  @Autowired private Queue queue;

  public void send(User user) {
    rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
    rabbitTemplate.convertAndSend(queue.getName(), user);
  }
}
