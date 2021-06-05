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
@Table(name="work_experience")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateWorkExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	@NotBlank
	@NotNull
	private int id;
	
	@Column(name="name")
	@NotBlank
	@NotNull
	private String name;
	
	@Column(name="position_name")
	@NotBlank
	@NotNull
	private String positionName;
	
	@Column(name="start_date")
	@NotBlank
	@NotNull
	private String startDate;
	
	@Column(name="end_date")
	@NotBlank
	@NotNull
	private String endDate;
	
}
