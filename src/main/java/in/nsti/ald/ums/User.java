package in.nsti.ald.ums;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String roll_no;


    @PrePersist
    private void ensureId() {
        if (this.roll_no == null) {
            this.roll_no = IdGenerator.generateId();
        }
    }

    // Getters and setters & constructor
    
	public String getId() {
		return roll_no;
	}

	public void setId(String roll_no) {
		this.roll_no = roll_no;
	}

	public User(String roll_no) {
		super();
		this.roll_no = roll_no;
	}

  

}

