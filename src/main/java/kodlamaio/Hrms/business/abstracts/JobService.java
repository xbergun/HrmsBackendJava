package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.JobPosition;

@Service
public interface JobService {
DataResult <List<JobPosition>>getAll();
Result add(JobPosition job);
}
