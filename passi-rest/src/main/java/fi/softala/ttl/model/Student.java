package fi.softala.ttl.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String firstname;
	private String lastname;
	private String school;
	private String email;
	private ArrayList<Group> groups;
	
	public Student() {
		super();
		this.username = "";
		this.firstname = "";
		this.lastname = "";
		this.school = "";
		this.email = "";
	}

	public Student(String username, String firstname, String lastname, String school, String email) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.school = school;
		this.email = email;
	}
	
	public void reset() {
		this.username = "";
		this.firstname = "";
		this.lastname = "";
		this.school = "";
		this.email = "";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Group> getGroups() {
		return groups;
	}

	public void setGroups(ArrayList<Group> groups) {
		this.groups = groups;
	}
}