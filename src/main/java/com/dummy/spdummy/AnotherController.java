package com.dummy.spdummy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherController {

	@GetMapping("/demo")
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Demo message");
	}
	
}
