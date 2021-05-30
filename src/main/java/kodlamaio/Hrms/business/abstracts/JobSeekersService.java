package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.JobSeekers;

@Service
public interface JobSeekersService {

	DataResult<List<JobSeekers>> getAll();	
	Result add(JobSeekers jobSeekers);
	Result delete(JobSeekers jobSeekers);
}
