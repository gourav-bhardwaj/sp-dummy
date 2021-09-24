package com.dummy.spdummy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
	
	@GetMapping("/hello-world")
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Hello world - Gourav Hii bro FEATURE DON -- modification");
	}

}
