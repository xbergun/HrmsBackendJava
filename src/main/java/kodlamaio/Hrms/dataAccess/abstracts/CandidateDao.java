package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.ettities.concretes.Candidate;


public interface CandidateDao extends JpaRepository<Candidate, Integer>{

}
