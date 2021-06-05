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

import kodlamaio.Hrms.business.abstracts.CandidateLanguageService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.CandidateLanguage;

@RestController
@RequestMapping("/api/languages")
public class CandidateLanguageController {
	
	private CandidateLanguageService candidateLanguageService;
	
	@Autowired
	public CandidateLanguageController(CandidateLanguageService candidateLanguageService) {
		super();
		this.candidateLanguageService = candidateLanguageService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CandidateLanguage>> getAll(){
		return this.candidateLanguageService.getAll();
	}
	
	
	@PostMapping("/add")
	public void add(@RequestBody CandidateLanguage candidateLanguage){
		this.candidateLanguageService.add(candidateLanguage);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestParam CandidateLanguage candidateLanguage) {
		return this.candidateLanguageService.delete(candidateLanguage);
	}
	

}
