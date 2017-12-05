package kr.ac.hansung.model;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Take {
	
	@Range(min=1, message = "You must write the year correctly")
	private int year;
	
	@Range(min=1, max=2, message = "Semester must be between 1 and 2")
	private int semester;
	
	@NotEmpty(message = "The code cannot be empty")
	private String code;
	
	@NotEmpty(message = "The subject cannot be empty")
	private String subject;
	
	@NotEmpty(message = "The separation cannot be empty")
	private String separation;
	
	@Range(min=1, max=6, message = "Credit must be between 1 and 6")
	private int credit;

}
