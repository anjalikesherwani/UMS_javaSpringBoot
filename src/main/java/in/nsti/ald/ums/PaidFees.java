package in.nsti.ald.ums;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "`PaidFees`")
public class PaidFees {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rollNumber;
    private String studentName;
    private String course;
    private String semester;
    private String feesStatus;
    private LocalDate date;
	
    //getter &setter
    
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getFeesStatus() {
		return feesStatus;
	}

	public void setFeesStatus(String feesStatus) {
		this.feesStatus = feesStatus;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public PaidFees(Long id, String rollNumber, String studentName, String course, String semester, String feesStatus,
			LocalDate date) {
		super();
		this.id = id;
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.course = course;
		this.semester = semester;
		this.feesStatus = feesStatus;
		this.date = date;
	}
    
    

	
	public PaidFees() {
		// TODO Auto-generated constructor stub
	}
    
}
