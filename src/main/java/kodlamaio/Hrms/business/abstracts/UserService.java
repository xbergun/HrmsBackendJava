package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.Users;

@Service
public interface UserService {
	
	DataResult <List<Users>> getAll();
	
	Result add(Users user);
	
}
