package kodlamaio.Hrms.apicontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.CandidateWorkExperienceService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.CandidateWorkExperience;

@RestController
@RequestMapping("/api/workexperience")
public class CandidateWorkExperienceController {

	private CandidateWorkExperienceService candidateWorkExperienceService;

	@Autowired
	public CandidateWorkExperienceController(CandidateWorkExperienceService candidateWorkExperienceService) {
		super();
		this.candidateWorkExperienceService = candidateWorkExperienceService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CandidateWorkExperience>> getAll(){
		return this.candidateWorkExperienceService.getAll();
	}
	
	
	@PostMapping("/add")
	public void add(@RequestBody CandidateWorkExperience candidateWorkExperience){
		this.candidateWorkExperienceService.add(candidateWorkExperience);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody CandidateWorkExperience candidateWorkExperience){
		this.candidateWorkExperienceService.update(candidateWorkExperience);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestParam CandidateWorkExperience candidateWorkExperience) {
		return this.candidateWorkExperienceService.delete(candidateWorkExperience);
	}
	
	
	


}


