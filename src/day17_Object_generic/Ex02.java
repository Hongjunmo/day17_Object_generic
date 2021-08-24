package day17_Object_generic;


class Print02<T> {
	public void test(T n1, T n2) {
		System.out.println(n1 + "," + n2);
	}

}

public class Ex02 {
	public static void main(String[] args) {
		Print02<Double> dou = new Print02<Double>();
		dou.test(1.11, 2.222);
		Print02<String> st = new Print02<String>();
		st.test("aa", "bb");
		Print02<Integer> in = new Print02<Integer>();
		in.test(10, 20);
		
	}
}
