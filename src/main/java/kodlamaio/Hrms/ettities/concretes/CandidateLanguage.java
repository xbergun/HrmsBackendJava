package kodlamaio.Hrms.ettities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candidate_language")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	@NotNull
	@NotBlank
	private int id;
	
	
	
	@Column(name="name")
	@NotNull
	@NotBlank
	private String name;
	
	@Column(name="level")
	@NotNull
	@NotBlank
	@DecimalMin(value = "1")
	@DecimalMax(value = "5")
	private Byte level;
}
