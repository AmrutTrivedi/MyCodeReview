
import java.util.Scanner;

interface Personal {
	void details();
}

public class MyClass {
	String name = "Amrut";
	int age = 25, emp_id = 1052;
	long phoneNo = 9710044201l;

	void details() {
		System.out.println("Student Details :");
		System.out.println("Details of the Student:\n" + "Student Name :" + name);
		System.out.println("Age: " + age);
		System.out.println("Contact Details: " + phoneNo);
		System.out.println("Employee ID: " + emp_id);
	}
}

class Result {
	public static void main(String args[]) {
		MyClass M1 = new MyClass();
		M1.details();
		int sum = 0;

		System.out.println("Enter Name Of the Test:");
		Scanner Sc = new Scanner(System.in);
		String Name = Sc.nextLine();
		System.out.println("Name of the Test:" + Name);

		System.out.println("Enter Number Of Subjects : ");
		Scanner Sc1 = new Scanner(System.in);
		int num = Sc1.nextInt();
		System.out.println("Number Of Subjects are:" + num);

		for (int i = 0; i < num; i++) {
			System.out.println("Enter Name of the Subject:");
			Scanner Sub1 = new Scanner(System.in);
			String Subject = Sub1.nextLine();
			System.out.println("Enter Marks Secured : ");
			int Marks1 = Sub1.nextInt();
			System.out.println("Subject Marks:" + Marks1);
			sum = sum + Marks1;
		}
	}
}
