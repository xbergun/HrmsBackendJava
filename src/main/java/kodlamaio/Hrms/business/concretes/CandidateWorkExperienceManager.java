package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CandidateWorkExperienceService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateWorkExperienceDao;
import kodlamaio.Hrms.ettities.concretes.CandidateWorkExperience;


@Service
public class CandidateWorkExperienceManager implements CandidateWorkExperienceService{

	private CandidateWorkExperienceDao candidateWorkExperienceDao;
	
	
	@Autowired
	public CandidateWorkExperienceManager(CandidateWorkExperienceDao candidateWorkExperienceDao) {
		super();
		this.candidateWorkExperienceDao = candidateWorkExperienceDao;
	}

	
	
	@Override
	public DataResult<List<CandidateWorkExperience>> getAll() {
		return new SuccessDataResult<List<CandidateWorkExperience>>(this.candidateWorkExperienceDao.findAll(),"İş Deneyimleri Listelendi.");

	}


	@Override
	public Result add(CandidateWorkExperience candidateWorkExperience) {
		this.candidateWorkExperienceDao.save(candidateWorkExperience);
		return new SuccessResult("İş Deneyimi Başarıyla Eklendi.");
	}

	@Override
	public Result update(CandidateWorkExperience candidateWorkExperience) {
		this.candidateWorkExperienceDao.save(candidateWorkExperience);
		return new SuccessResult("İş Deneyimi Başarıyla Güncellendi.");
	}

	@Override
	public Result delete(CandidateWorkExperience candidateWorkExperience) {
		this.candidateWorkExperienceDao.delete(candidateWorkExperience);
		return new SuccessResult("İş İlanı Başarıyla Silindi.");
	}

}
