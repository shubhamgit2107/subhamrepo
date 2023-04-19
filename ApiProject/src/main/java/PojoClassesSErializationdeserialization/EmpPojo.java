package PojoClassesSErializationdeserialization;

public class EmpPojo {
	String name;
	int[] empid;
	String mail;
	long[] phone;
	String[] add;
	public EmpPojo(String name, int[] empid, String mail, long[] phone, String[] add) {
		super();
		this.name = name;
		this.empid = empid;
		this.mail = mail;
		this.phone = phone;
		this.add = add;
	}
	
	public EmpPojo() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getEmpid() {
		return empid;
	}

	public void setEmpid(int[] empid) {
		this.empid = empid;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long[] getPhone() {
		return phone;
	}

	public void setPhone(long[] phone) {
		this.phone = phone;
	}

	public String[] getAdd() {
		return add;
	}

	public void setAdd(String[] add) {
		this.add = add;
	}
	 
}
