package day17_Object_generic;

class Print {
	public void test(double n1, double n2) {
		System.out.println(n1 + "," + n2);
	}

	public void test(String n1, String n2) {
		System.out.println(n1 + "," + n2);
	}

	public void test(int n1, int n2) {
		System.out.println(n1 + "," + n2);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Print pr = new Print();
		pr.test(1.11, 2.222);
		pr.test("aa", "bb");
		pr.test(10, 20);

	}
}
