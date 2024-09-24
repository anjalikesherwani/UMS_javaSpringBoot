package in.nsti.ald.ums;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "checkLeaves")
public class CheckLeaves {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rollno;
    private String studentname;
    private LocalDate date;
    private String leavetype;
    private String leavestatus;
	
    
    //getter & setter
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getLeavetype() {
		return leavetype;
	}
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}
	public String getLeavestatus() {
		return leavestatus;
	}
	public void setLeavestatus(String leavestatus) {
		this.leavestatus = leavestatus;
	}
	
	//constructor
	
	public CheckLeaves(Long id, String rollno, String studentname, LocalDate date, String leavetype,
			String leavestatus) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.studentname = studentname;
		this.date = date;
		this.leavetype = leavetype;
		this.leavestatus = leavestatus;
	}
	public CheckLeaves() {
		// TODO Auto-generated constructor stub
	}
    
    
	
    
}
