package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.Hrms.business.abstracts.EmailService;
import kodlamaio.Hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.EmailDao;
import kodlamaio.Hrms.ettities.concretes.EmailVerification;

public class EmailManager implements EmailService{

	private EmailDao emailDao;
	
	 @Autowired
	public EmailManager(EmailDao emailDao) {
			super();
			this.emailDao = emailDao;
		}
	
	
	
	@Override
	public void generateCode(EmailVerification code, Integer id) {
		EmailVerification code_ = code;
		code.setCode(null);
		code.setVerified(false);
		if(code.isVerified() == false) {
			emailDao.save(code);
			
		}
		return ;
		
	}

	@Override
	public Result verify(String verificationCode, Integer id) {
		EmailVerification ref = emailDao.findByUserId(id).stream().findFirst().get();
		if(ref.getCode().equals(verificationCode) && ref.isVerified() != true) {
			ref.setVerified(true);
			return  new SuccessDataResult<EmailVerification>(this.emailDao.save(ref),"Başarılı");
		}
		else if(ref.isVerified() == true) {
			return  new ErrorDataResult<EmailVerification>(null,"Zaten Doğrulanmış Hesap");
		}
		return  new ErrorDataResult<EmailVerification>(null,"Doğrulama Kodu Geçersiz");
		
	}

	
}
