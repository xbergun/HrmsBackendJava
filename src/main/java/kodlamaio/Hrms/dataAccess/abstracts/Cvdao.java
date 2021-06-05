package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.Hrms.ettities.concretes.Cv;
public interface Cvdao extends JpaRepository<Cv, Integer>{

}
