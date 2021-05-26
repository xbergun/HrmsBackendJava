package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.ettities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers,Integer> {

}
