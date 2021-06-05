package kodlamaio.Hrms.apicontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.CandidateSchoolService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.CandidateSchool;

@RestController
@RequestMapping("/api/candidateSchoolController")
public class CandidateSchoolController {
	private CandidateSchoolService candidateSchoolService;

	@Autowired
	public CandidateSchoolController(CandidateSchoolService candidateSchoolService) {
		super();
		this.candidateSchoolService = candidateSchoolService;
	}
	
	@GetMapping("/gelall")
	public DataResult<List<CandidateSchool>> getAll(){
		return this.candidateSchoolService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody CandidateSchool candidateSchool) {
		return this.candidateSchoolService.add(candidateSchool);
		
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestBody CandidateSchool candidateSchool) {
		return this.candidateSchoolService.delete(candidateSchool);
		
	}
	

}
