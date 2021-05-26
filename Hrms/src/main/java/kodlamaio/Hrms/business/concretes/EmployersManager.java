package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.EmployerService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.EmployersDao;
import kodlamaio.Hrms.ettities.concretes.Employers;


@Service
public class EmployersManager implements EmployerService{

	private EmployersDao employersDao;
	
	
	@Autowired
	public EmployersManager(EmployersDao employersDao)  {
		this.employersDao=employersDao;
	}
	
	
	@Override
	public DataResult<List<Employers>> getAll() {
		// TODO Auto-generated method stub
        return  new SuccessDataResult<List<Employers>>(this.employersDao.findAll(),"Employers Listelendi");

	}

	@Override
	public Result add(Employers employers) {
		this.employersDao.save(employers);
		return new SuccessResult("Ürün Eklendi");
	}

}
