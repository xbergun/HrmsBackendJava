package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CandidateSchoolService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateSchoolDao;
import kodlamaio.Hrms.ettities.concretes.CandidateSchool;

@Service
public class CandidateSchoolManager implements CandidateSchoolService{

	private CandidateSchoolDao candidateSchoolDao;
	
	
	
	@Autowired
	public CandidateSchoolManager(CandidateSchoolDao candidateSchoolDao) {
		super();
		this.candidateSchoolDao = candidateSchoolDao;
	}

	@Override
	public DataResult<List<CandidateSchool>> getAll() {
        return  new SuccessDataResult<List<CandidateSchool>>(this.candidateSchoolDao.findAll(),"Okullar Listelendi");

	}

	@Override
	public Result add(CandidateSchool candidateSchool) {
		this.candidateSchoolDao.save(candidateSchool);
		return new SuccessResult("Okul Eklendi");
	}
	@Override
	public Result delete(CandidateSchool candidateSchool) {
		this.candidateSchoolDao.delete(candidateSchool);
		return new SuccessResult("Okul Silindi");
	}
	
	
}
