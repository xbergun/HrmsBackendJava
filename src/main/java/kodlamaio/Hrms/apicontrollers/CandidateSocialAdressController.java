package kodlamaio.Hrms.apicontrollers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.CandidateSocialAdressService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.CandidateSocialAdress;

@RestController
@RequestMapping("/api/candidatesocialadress")
public class CandidateSocialAdressController {

	private CandidateSocialAdressService candidateSocialAdressService;

	public CandidateSocialAdressController(CandidateSocialAdressService candidateSocialAdressService) {
		super();
		this.candidateSocialAdressService = candidateSocialAdressService;
	}
	
	@GetMapping("/gelall")
	public DataResult<List<CandidateSocialAdress>> getAll(){
		return this.candidateSocialAdressService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody CandidateSocialAdress candidateSocialAdress) {
		return this.candidateSocialAdressService.add(candidateSocialAdress);
		
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestBody CandidateSocialAdress candidateSocialAdress) {
		return this.candidateSocialAdressService.delete(candidateSocialAdress);
		
	}
}
