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
@Table(name="candidate_school")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateSchool {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	
	@Column(name="university_name")
	@NotBlank
	@NotNull
	private String universityName;
	
	
	@Column(name="university_department")
	@NotBlank
	@NotNull
	private String universityDepartment;
	
	
	@Column(name="year_of_entry")
	@NotBlank
	@NotNull
	private int yearOfEntry;
	
	
	@Column(name="gradition_year")
	@NotBlank
	@NotNull
	private int graditionYear;
	
	
}
