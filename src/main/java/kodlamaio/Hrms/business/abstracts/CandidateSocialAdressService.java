package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.CandidateSocialAdress;

@Service
public interface CandidateSocialAdressService {
	DataResult <List<CandidateSocialAdress>>getAll();
	Result add(CandidateSocialAdress candidateSocialAdress);
	Result delete(CandidateSocialAdress candidateSocialAdress);

}
