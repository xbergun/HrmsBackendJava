package kodlamaio.Hrms.apicontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobSeekersService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.JobSeekers;

@RestController
@RequestMapping("/api/jobseekers")

public class JobSeekerController {

	private JobSeekersService jobSeekersService;
	
	@Autowired
	public JobSeekerController(JobSeekersService jobSeekersService) {
		super();
		this.jobSeekersService=jobSeekersService;
	} 
	
	@GetMapping("/getall")
	public DataResult<List<JobSeekers>> getAll(){
		return this.jobSeekersService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekers jobSeekers) {
		return this.jobSeekersService.add(jobSeekers);
		
	}
	
}
