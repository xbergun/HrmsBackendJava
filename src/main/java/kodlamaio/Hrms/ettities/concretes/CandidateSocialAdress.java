package kodlamaio.Hrms.ettities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candidate_social_adress")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateSocialAdress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="github_adress")
	@NotBlank
	@NotNull
	private String githubLink;
	
	@Column(name="linkedin_adress")
	@NotBlank
	@NotNull
	private String LinkedinLink;
}
