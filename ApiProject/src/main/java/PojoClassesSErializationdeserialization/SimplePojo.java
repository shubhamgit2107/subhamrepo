package PojoClassesSErializationdeserialization;

public class SimplePojo {
	String emane;
	String eid;
	int Phone;
	String email;
	String address;
	public SimplePojo(String emane, String eid, int phone, String email, String address) {
		super();
		this.emane = emane;
		this.eid = eid;
		 phone = phone;
		this.email = email;
		this.address = address;
	}
	public SimplePojo()
	{
		
	}
	public String getEmane() {
		return emane;
	}
	public void setEmane(String emane) {
		this.emane = emane;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
