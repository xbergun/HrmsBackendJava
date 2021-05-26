package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobDao;
import kodlamaio.Hrms.ettities.concretes.Job;



@Service
public class JobManager implements JobService {

	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		this.jobDao=jobDao;
	}

	@Override
    public DataResult<List<Job>> getAll() {

        return  new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Data Listelendi");
    }
	
	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("Ürün Eklendi");
	}

	

}
