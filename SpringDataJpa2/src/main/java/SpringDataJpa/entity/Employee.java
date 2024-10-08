package SpringDataJpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emptbl")
public class Employee {
	@Id
	@Column(name="id")
private  Integer Empid;
	@Column(name="name")
private String EmpName;
	@Column(name="sal")
private double EmpSal;

public Integer getEmpid() {
	return Empid;
}
public void setEmpid(Integer empid) {
	Empid = empid;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public double getEmpSal() {
	return EmpSal;
}
public void setEmpSal(double empSal) {
	EmpSal = empSal;
}
@Override
public String toString() {
	return "Employee [Empid=" + Empid + ", EmpName=" + EmpName + ", EmpSal=" + EmpSal + "]";
}


}