package in.notification.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationRestController {

	@GetMapping("/test") 
	public String appTest() {
		return "Notification App is working";
	}
}
