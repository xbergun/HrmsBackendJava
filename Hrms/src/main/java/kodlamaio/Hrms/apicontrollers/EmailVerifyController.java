package kodlamaio.Hrms.apicontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.EmailService;
import kodlamaio.Hrms.core.utilities.results.Result;

@RestController
@RequestMapping("/api/verify")

public class EmailVerifyController {
	private EmailService emailService;
	
	
	@Autowired
	public EmailVerifyController(EmailService emailService) {
		super();
		this.emailService = emailService;
	}



	@PostMapping("/update/{verificationCode}/{id}")
	public Result setVerify(@RequestParam String verificationCode,@RequestParam Integer id) {
			return emailService.verify(verificationCode,id);
	}
}