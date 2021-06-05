package kodlamaio.Hrms.ettities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cv")
public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	 @ManyToOne()
	 @JoinColumn(name = "social_adress_id")
	 private CandidateSocialAdress socialAdress;
	
	 @ManyToOne()
	 @JoinColumn(name = "jobseeker_id")
	 private JobSeekers jobSeeker;

	 @OneToMany(mappedBy = "Cv")
	 private List<CandidateSchool> educations;

	 @OneToMany(mappedBy = "Cv")
	  private List<CandidateWorkExperience> jobExperiences;

   @OneToMany(mappedBy = "Cv")
  private List<CandidateLanguage> jobSeekerLanguages;


	
}
