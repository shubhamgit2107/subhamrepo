package PojoClassesSErializationdeserialization;

public class StudentPojo {
	
	String name;
	String[] branch;
	long[] contect;
	int[] sid;
	public StudentPojo(String name, String[] branch, long[] contect, int[] sid) {
		super();
		this.name = name;
		this.branch = branch;
		this.contect = contect;
		this.sid = sid;
	}
	public StudentPojo()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getBranch() {
		return branch;
	}
	public void setBranch(String[] branch) {
		this.branch = branch;
	}
	public long[] getContect() {
		return contect;
	}
	public void setContect(long[] contect) {
		this.contect = contect;
	}
	public int[] getSid() {
		return sid;
	}
	public void setSid(int[] sid) {
		this.sid = sid;
	}
	

}
