package io.spring.cloud.samples.fortuneteller.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.spring.cloud.samples.fortuneteller.ui.service.fortunes.Fortune;
import io.spring.cloud.samples.fortuneteller.ui.service.fortunes.FortuneService;


@RestController
public class UiController {

	@Autowired
	FortuneService service;

	@Value("${foo1:1234}")
	String name = "World";

	@RequestMapping("/random")
	public Fortune randomFortune() {
		return service.randomFortune();
	}

	@RequestMapping("/cjd")
	public String randomFortune1() {
		return name;
	}
}
