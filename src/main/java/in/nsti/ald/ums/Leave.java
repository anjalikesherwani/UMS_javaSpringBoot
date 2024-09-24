package in.nsti.ald.ums;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "`leave`")
public class Leave {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rollno;
    private LocalDate date;
    private String time;
    private String status;

    // No-argument constructor
    public Leave() {
    }

    
    // Constructor with fields (if needed)
	public Leave(Long id, String rollno, LocalDate date, String time, String status) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.date = date;
		this.time = time;
		this.status = status;
	}

	//Getter & Setter
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


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	
  

}
