package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.CandidateLanguage;


@Service
public interface CandidateLanguageService {
	DataResult<List<CandidateLanguage>> getAll();
	Result add(CandidateLanguage candidateLanguage);
	Result delete(CandidateLanguage candidateLanguage);
}
