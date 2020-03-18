package pojosEntities;

import java.io.Serializable;
import java.sql.Date;

public class Patient implements Serializable {
	
	
	private Integer id;
	private String  name;
	private String  address;
	private Date    dob;
	private Integer phoneNumber;
	private String  eMail;
	private String  sport;
	private String  disability;
	
	public Patient() {
		super();
	}
	
	public Patient(int id, String name, String address, Date dob, Integer phoneNumber, 
					String eMail, String sport, String disability) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.sport = sport;
		this.disability = disability;
		
	}
	
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(Integer phoneNumber) {
	this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return eMail;
	}
	
	public void setEmail(String eMail) {
		this.eMail = eMail;
	}
	
	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}
	
	
	
	
	

}
