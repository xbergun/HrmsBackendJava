package kodlamaio.Hrms.business.abstracts;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.ettities.concretes.Cv;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;


@Service
public interface CvService {
	Result add(Cv cv);
	DataResult <List<Cv>> findByJobSeekerId(int jobseekerId);
	DataResult<List<Cv>> getAll();
}
