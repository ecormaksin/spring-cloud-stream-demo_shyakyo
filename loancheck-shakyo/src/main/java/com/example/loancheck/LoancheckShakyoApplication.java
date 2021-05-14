package com.example.loancheck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(LoanProcessor.class)
public class LoancheckShakyoApplication {

	public static final Logger log = LoggerFactory.getLogger(LoancheckShakyoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoancheckShakyoApplication.class, args);
		log.info("The Loancheck Application has started...");
	}
}
