package br.com.jms.producer.controller;

import br.com.jms.producer.model.User;
import br.com.jms.producer.service.OrderQueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

  @Autowired OrderQueueSender orderQueueSender;

  @PostMapping
  public void queueNewData(@RequestBody User user) {
    orderQueueSender.send(user);
  }
}
