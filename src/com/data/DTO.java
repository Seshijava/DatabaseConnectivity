package com.data;

public class DTO {
private int id;
private String name;
private String address;
private int phone;
@Override
public String toString() {
	return "DTO [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
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
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public DTO(){}
public DTO(int id, String name, int phone, String address){
     this.id = id;
         this.name = name;
     this.phone = phone;
     this.address = address;		
}
public void printvalues(int id1, String name1, int phone1, String address1){
	
	System.out.println("id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "");
	
	
}

}
