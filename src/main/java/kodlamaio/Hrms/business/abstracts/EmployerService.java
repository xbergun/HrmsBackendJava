package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.Employers;


@Service
public interface EmployerService {

		DataResult <List<Employers>>getAll();
		Result add(Employers employers);
}
