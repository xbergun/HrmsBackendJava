package kodlamaio.Hrms.apicontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.CandidateService;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.Candidate;



@RestController
@RequestMapping("/api/candidate")

public class CandidateController {
	private CandidateService candiDateService;
	
	@Autowired
	public CandidateController(CandidateService candiDateService) {
		super();
		this.candiDateService=candiDateService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candiDateService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate) {
		return this.candiDateService.add(candidate);
		
	}
	
}
