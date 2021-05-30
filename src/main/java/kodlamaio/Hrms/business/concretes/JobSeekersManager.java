package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobSeekersService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.Hrms.ettities.concretes.JobSeekers;

@Service
public class JobSeekersManager implements JobSeekersService{

	private JobSeekersDao jobseekersDao;
	
	@Autowired
	public JobSeekersManager(JobSeekersDao jobseekersDao) {
		this.jobseekersDao=jobseekersDao;
	}
	
	@Override
	public DataResult<List<JobSeekers>> getAll() {
        return  new SuccessDataResult<List<JobSeekers>>(this.jobseekersDao.findAll(),"İş Arayanlar Listelendi");

	}

	@Override
	public Result add(JobSeekers jobSeekers) {
		this.jobseekersDao.save(jobSeekers);
		return new SuccessResult("İş Arayan Eklendi");
	}

	

	@Override
	public Result delete(JobSeekers jobSeekers) {
		this.jobseekersDao.delete(jobSeekers);
		return new SuccessResult("İş Arayan Silindi");
	}

}
