package systematicjdbc;

public class Employeeinfo {
private int empid;
private String name;
private String lastname;
private int age;
public Employeeinfo(int empid, String name, String lastname, int age, String sex) {
	super();
	this.empid = empid;
	this.name = name;
	this.lastname = lastname;
	this.age = age;
	this.sex = sex;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
private String sex;

}
