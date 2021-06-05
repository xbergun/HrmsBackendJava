package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CandidateSocialAdressService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateSocialAdressDao;
import kodlamaio.Hrms.ettities.concretes.CandidateSocialAdress;

@Service
public class CandidateSocialAdressManager implements CandidateSocialAdressService{

	private CandidateSocialAdressDao candidateSocialAdressDao;
	
	
	@Autowired
	public CandidateSocialAdressManager(CandidateSocialAdressDao candidateSocialAdressDao) {
		super();
		this.candidateSocialAdressDao = candidateSocialAdressDao;
	}

	@Override
	public DataResult<List<CandidateSocialAdress>> getAll() {
        return  new SuccessDataResult<List<CandidateSocialAdress>>(this.candidateSocialAdressDao.findAll(),
        		"Sosyal Medya Adresleri Listelendi");

	}

	@Override
	public Result add(CandidateSocialAdress candidateSocialAdress) {
		this.candidateSocialAdressDao.save(candidateSocialAdress);
		return new SuccessResult("S. Adresler Eklendi");
	}

	@Override
	public Result delete(CandidateSocialAdress candidateSocialAdress) {
		this.candidateSocialAdressDao.delete(candidateSocialAdress);
		return new SuccessResult("S. Adresler Eklendi");
	}

	
}
