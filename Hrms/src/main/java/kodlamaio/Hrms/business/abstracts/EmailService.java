package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.EmailVerification;

public interface EmailService {
	void generateCode(EmailVerification code, Integer id);
	Result verify(String verificationCode, Integer id);
}
