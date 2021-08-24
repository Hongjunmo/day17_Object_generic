package day17_Object_generic;

import java.util.ArrayList;
import java.util.Scanner;

public class StInfo_Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<StInfo> arr = new ArrayList<StInfo>();

		String name;
		int age;

		while (true) {
			System.out.println("1.등록 2.확인");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				StInfo s = new StInfo();
				System.out.print("이름 입력:");
				name = scan.next();
				System.out.print("나이 입력:");
				age = scan.nextInt();
				s.setAge(age);
				s.setName(name);
				arr.add(s);
				System.out.println("등록 완료");
				break;
			case 2:
				for (int i = 0; i < arr.size(); i++) {
					StInfo ss = arr.get(i);
					System.out.println("이름 : " + ss.getName());
					System.out.println("나이 : " + ss.getAge());
				}
				break;
			}
		}

	}
}
