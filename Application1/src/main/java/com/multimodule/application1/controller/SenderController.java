package com.multimodule.application1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.multimodule.application1.model.Person;
import com.multimodule.application1.service.SenderService;

@RestController
public class SenderController {
	@Autowired
	SenderService senderService;
	
	@PostMapping("/produce")
	public String produce(@RequestBody String msg){
		senderService.send(msg);
		return "Done";
	}
	
	@PostMapping("/person")
	public String produce(@RequestBody  Person person){
		senderService.send(person);
		return "Sending Person Done: " + person;
	}
}
