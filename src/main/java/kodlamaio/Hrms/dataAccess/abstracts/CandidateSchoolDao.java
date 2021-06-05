package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.ettities.concretes.CandidateSchool;

public interface CandidateSchoolDao extends JpaRepository<CandidateSchool, Integer>{
	CandidateSchool getByUniversityName(String universityName);
	
	CandidateSchool getByYearOfEntry(Integer year);
	
	

}
