package ders3Odev2;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String pasword;
	private String courseName;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
