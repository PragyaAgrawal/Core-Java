package com.java.lang;

public class EqualsMethod {

	public static void main(String[] args) {
		Leave obj1= new Leave(99);
		Leave obj2= new Leave(99);
		
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
		
	}
}


class Leave
{
	int sid;
	Leave(int sid)
	{
		this.sid=sid;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj instanceof Leave){
			Leave lv=(Leave)obj;
			return this.sid==lv.sid;
		}
		return false;
	}
	
	
}