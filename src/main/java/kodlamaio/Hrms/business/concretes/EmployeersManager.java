package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.EmployeerService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.EmpleyeersDao;
import kodlamaio.Hrms.ettities.concretes.Employeers;

@Service
public class EmployeersManager implements EmployeerService{
	
	private EmpleyeersDao employeersDao;
	
	
	@Autowired
	public EmployeersManager(EmpleyeersDao employeersDao) {
		this.employeersDao=employeersDao;
	}
	
	
	@Override
	public DataResult<List<Employeers>> getAll() {
		// TODO Auto-generated method stub
        return  new SuccessDataResult<List<Employeers>>(this.employeersDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Employeers employeers) {
		this.employeersDao.save(employeers);
		return new SuccessResult("employeers Eklendi");

	}
	

}
