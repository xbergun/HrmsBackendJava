package kodlamaio.Hrms.apicontrollers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
	private JobAdvertisementService jobAdvertisementService;
	
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	
	
	@GetMapping("/getallbyactive")
	public DataResult<List<JobAdvertisement>> getAllByActive(){
		return this.jobAdvertisementService.getAllSortedByActive();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody JobAdvertisement jobAdvertisement){
		this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody JobAdvertisement jobAdvertisement){
		this.jobAdvertisementService.update(jobAdvertisement);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestParam JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.delete(jobAdvertisement);
	}
}
