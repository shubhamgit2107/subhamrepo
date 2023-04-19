package PojoClassesSErializationdeserialization;

import org.testng.annotations.Test;

public class ObjectSpouse {
	
	@Test
	public static Object[] spouse(String name, int[] empid, String mail, long[] phone, String[] add)
	{
	EmpPojo e= new EmpPojo(name, empid, mail, phone, add);
       Object a[]= {e.getName(),e.getEmpid(),e.getMail(),e.getPhone(),e.getAdd()};
	return a;
	}

}
