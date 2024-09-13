package in.nsti.ald.ums;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	
    private String name;
    private String father_name;
    @Id
	/*
	 * @GeneratedValue(strategy=GenerationType.IDENTITY)
	 */
    private Long roll_no;
    @DateTimeFormat(pattern="dd-mm-yyyy")
    private LocalDate dob;
    private String address;
    private String state;
    private String phone;
    private String email;
    private float class_10;
    private float class_12;
    private String aadhar_no;
    private String gender;
    private String course;
    private String branch;
	
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public Long getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(Long roll_no) {
		this.roll_no = roll_no;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getClass_10() {
		return class_10;
	}
	public void setClass_10(float class_10) {
		this.class_10 = class_10;
	}
	public float getClass_12() {
		return class_12;
	}
	public void setClass_12(float class_12) {
		this.class_12 = class_12;
	}
	public String getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	public Student(String name, String father_name, Long roll_no, LocalDate dob, String address, String state,
			String phone, String email, float class_10, float class_12, String aadhar_no, String gender, String course,
			String branch) {
		super();
		this.name = name;
		this.father_name = father_name;
		this.roll_no = roll_no;
		this.dob = dob;
		this.address = address;
		this.state = state;
		this.phone = phone;
		this.email = email;
		this.class_10 = class_10;
		this.class_12 = class_12;
		this.aadhar_no = aadhar_no;
		this.gender = gender;
		this.course = course;
		this.branch = branch;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}

    
    
}