package com.multimodule.application1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.multimodule.application1.model.Person;


@Service
@EnableJms
public class SenderService {
	@Autowired
	JmsTemplate jmsTemplate;
	
	//@Value()
	String destinationQueue= "jms.queue.destination";
	
	public void send(String msg){
		jmsTemplate.convertAndSend(destinationQueue, msg);
	}
	public void send(Person p){
		jmsTemplate.convertAndSend(destinationQueue, p);
	}
}
