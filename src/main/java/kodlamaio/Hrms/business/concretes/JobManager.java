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
import kodlamaio.Hrms.ettities.concretes.JobPosition;



@Service
public class JobManager implements JobService {

	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		this.jobDao=jobDao;
	}

	@Override
    public DataResult<List<JobPosition>> getAll() {

        return  new SuccessDataResult<List<JobPosition>>(this.jobDao.findAll(),"Data Listelendi");
    }
	
	@Override
	public Result add(JobPosition job) {
		this.jobDao.save(job);
		return new SuccessResult("İş Eklendi");
	}

	

}
