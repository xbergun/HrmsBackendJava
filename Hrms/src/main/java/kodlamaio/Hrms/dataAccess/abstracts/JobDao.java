package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.ettities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer>{

}
