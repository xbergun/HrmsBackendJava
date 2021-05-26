package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.Employeers;

@Service
public interface EmployeerService {
	DataResult <List<Employeers>>getAll();
	Result add(Employeers employeers);
}
