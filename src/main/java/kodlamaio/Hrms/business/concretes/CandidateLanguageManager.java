package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CandidateLanguageService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateLanguageDao;
import kodlamaio.Hrms.ettities.concretes.CandidateLanguage;


@Service
public class CandidateLanguageManager implements CandidateLanguageService{

	private CandidateLanguageDao candidateLanguageDao;
	
	
	
	@Autowired
	public CandidateLanguageManager(CandidateLanguageDao candidateLanguageDao) {
		super();
		this.candidateLanguageDao = candidateLanguageDao;
	}

	@Override
	public DataResult<List<CandidateLanguage>> getAll() {
		return new SuccessDataResult<List<CandidateLanguage>>(this.candidateLanguageDao.findAll(),"Diller Listelendi.");
	}

	@Override
	public Result add(CandidateLanguage candidateLanguage) {
		this.candidateLanguageDao.save(candidateLanguage);
		return new SuccessResult("Dil Başarıyla Eklendi.");
	}

	
	@Override
	public Result delete(CandidateLanguage candidateLanguage) {
		this.candidateLanguageDao.delete(candidateLanguage);
		return new SuccessResult("Dil Başarıyla Silindi.");
	}

}
