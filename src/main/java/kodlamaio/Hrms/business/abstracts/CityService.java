package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.ettities.concretes.City;

@Service
public interface CityService {
	
	DataResult<List<City>> getAll();
}
