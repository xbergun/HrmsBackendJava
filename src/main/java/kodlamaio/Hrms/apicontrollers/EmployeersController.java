package kodlamaio.Hrms.apicontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.EmployeerService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.Employeers;

@RestController
@RequestMapping("/api/employeers")

public class EmployeersController {

	private EmployeerService employeerService;
	
	@Autowired
	public EmployeersController(EmployeerService employeerService) {
		super();
		this.employeerService=employeerService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Employeers>> getAll(){
		return this.employeerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employeers employeers) {
		return this.employeerService.add(employeers);
		
	}
	
	
}
