package day17_Object_generic;

import java.util.ArrayList;

class Test{
	private String test;
	public void setTest(String test) {
		this.test=test;
	}
	public String getTest() {
		return test;
	}
	public void display () {
		System.out.println("test 기능입");
	}
}



public class Ex04 {
	public static void main(String[] args) {
		ArrayList<Test> arr = new ArrayList<Test>();

		Test t = new Test();
		t.setTest("asdf");
		Test a = arr.get(0);
		
		System.out.println(a.getTest());
	
	
	
	
	}
}
