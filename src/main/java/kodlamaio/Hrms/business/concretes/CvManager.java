package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.Hrms.Services.CloudinaryService;
import kodlamaio.Hrms.business.abstracts.CvService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.Cvdao;

import kodlamaio.Hrms.ettities.concretes.Cv;

public class CvManager implements CvService {
	  private  Cvdao cvDao;
	  private CloudinaryService cloudinaryService;
	  	
	  @Autowired
	    public CvManager(Cvdao cvDao, CloudinaryService cloudinaryService) {
	        this.cvDao = cvDao;
	        this.cloudinaryService = cloudinaryService;

	    }

		@Override
		public Result add(Cv cv) {
			this.cvDao.save(cv);
			return new SuccessResult("Cv Başarıyla Eklendi.");
		}

		@Override
		public DataResult<List<Cv>> findByJobSeekerId(int jobseekerId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public DataResult<List<Cv>> getAll() {
			return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(),"Cv Listelendi.");

		}

}
