package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.ettities.concretes.Employeers;

public interface EmpleyeersDao extends JpaRepository<Employeers, Integer>{

}
