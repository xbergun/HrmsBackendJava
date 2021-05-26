package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.ettities.concretes.EmailVerification;

public interface EmailDao extends JpaRepository<EmailVerification, Integer>{
	List<EmailVerification> findByUserId(Integer userId);
}
