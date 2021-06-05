package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.CandidateSchool;

@Service
public interface CandidateSchoolService {
	DataResult <List<CandidateSchool>>getAll();
	Result add(CandidateSchool candidateSchool);
	Result delete(CandidateSchool candidateSchool);
	
}
