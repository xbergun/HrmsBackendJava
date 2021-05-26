package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CandidateService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.ettities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		this.candidateDao=candidateDao;
	}
	
	@Override
	public DataResult<List<Candidate>> getAll() {
        return  new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"iş Arayanlar Listelendi");
	}

	@Override
	public Result add(Candidate candidates) {
		this.candidateDao.save(candidates);
		return new SuccessResult("İş Arayan Eklendi");
	}

}
