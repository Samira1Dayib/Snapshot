package com.example.snapshot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SnapshotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnapshotApplication.class, args);
	}

}
