package SpringDataJpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empAddtbl")

public class Address {
	
	public Address(Integer addid, String city, String state, Integer pincode, String country, Integer empid) {
		super();
		this.addid = addid;
		this.city = city;
		this.state = state;
		Pincode = pincode;
		this.country = country;
		Empid = empid;
	}
	@Id
	@Column(name="id")
private Integer addid;
	//@Column(name="city")
private String city;
//	@Column(name="state")
private String  state;
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", city=" + city + ", state=" + state + ", Pincode=" + Pincode + ", country="
				+ country + ", Empid=" + Empid + "]";
	}
	//@Column(name="pin")
private Integer Pincode;
//	@Column(name="country")
private String  country;
	@Column(name="empid")
private Integer  Empid;
	
public Integer getAddid() {
	return addid;
}
public void setAddid(Integer addid) {
	this.addid = addid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Integer getPincode() {
	return Pincode;
}
public void setPincode(Integer pincode) {
	Pincode = pincode;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Integer getEmpid() {
	return Empid;
}
public void setEmpid(Integer empid) {
	Empid = empid;
}


}
