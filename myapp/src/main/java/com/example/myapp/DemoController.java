package com.example.myapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.myapp.entity.Details;
import com.example.myapp.repository.DetailsRepository;

@RestController
public class DemoController {
	@Autowired
	private DetailsRepository detailsRepository;
@PostMapping("/test")
public Details addDetails(@RequestBody Details details) {
	detailsRepository.save(details);
	return details;
	
}
}
