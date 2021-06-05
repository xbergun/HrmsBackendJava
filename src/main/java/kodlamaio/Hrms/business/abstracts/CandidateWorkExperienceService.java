package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.CandidateWorkExperience;


@Service
public interface CandidateWorkExperienceService {
	DataResult<List<CandidateWorkExperience>> getAll();
	Result add(CandidateWorkExperience candidateWorkExperience);
	Result update(CandidateWorkExperience candidateWorkExperience);
	Result delete(CandidateWorkExperience candidateWorkExperience);
}
