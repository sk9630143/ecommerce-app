package in.admin.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.admin.api.dao.AdminDao;

@RestController
@RequestMapping("/admin")
public class AdminRestController {

	
	@PostMapping("/validate")
	public ResponseEntity<String> validateUser(@RequestBody AdminDao admin) {
		List<String> validUsersEmailIds = Arrays.asList("sk9630143@gmail.com", "rg9630143@gmail.com");
		String isValidUser = "Invalid User";
		if(validUsersEmailIds.contains(admin.getEmailId()))
				isValidUser = "Valid User";
		
		return new ResponseEntity<String>(isValidUser, HttpStatus.OK);
	}
}
