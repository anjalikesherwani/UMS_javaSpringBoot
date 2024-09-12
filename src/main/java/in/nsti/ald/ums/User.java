package in.nsti.ald.ums;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String id;


    @PrePersist
    private void ensureId() {
        if (this.id == null) {
            this.id = IdGenerator.generateId();
        }
    }

    // Getters and setters & constructor
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User(String id) {
		super();
		this.id = id;
	}

  

}

