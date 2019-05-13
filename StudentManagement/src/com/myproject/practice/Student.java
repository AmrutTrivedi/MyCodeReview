package com.myproject.practice;
import java.util.Scanner;

public class Student {
public static void main(String args[]) {

int id[] = {0,1,2};
String name[] = {"Amit","Amrut","Ram"};
String email[] = {"amit01@gmail.com","amrut@gmail.com","ram30@gmail.com"};

System.out.println("Enter your choices :");
System.out.println("1.List no of students :");
System.out.println("2.Student Details by Id :");
System.out.println("3.Create Student by ID");
System.out.println("3.Delete students by id :");
System.out.println("4.Exit");

Scanner scanner = new Scanner(System.in);
System.out.println("Enter Your Choice :");
int number = scanner.nextInt();

switch(number) {
case 1:
	System.out.println("1.List number of students :");
	System.out.println("ID \t"+"Student Name \t"+  "Email ID");
	for(int i=0;i<id.length;i++)
	{
		System.out.println(id[i]+"           "+name[i]+"      "+email[i]);	
	}
	System.out.println("Enter Your Choice :");
	scanner.nextInt();
	
case 2: 
	System.out.println("2.Student Details by id :");
	System.out.println("Enter Student Id");
	int number1 =scanner.nextInt();
		while(id[number1]==number1) {
			System.out.println("ID \t"+"Student Name \t"+"\tEmail ID");
			System.out.println(id[number1]+"      "+name[number1]+"\t       "  +email[number1]);
			break;
		}
		System.out.println("Enter Your Choice :");
		scanner.nextInt();
case 3:
	System.out.println("3. Create Student by ID");
	System.out.println("ID \t"+"Student Name \t"+"\tEmail ID");
	int number2 = scanner.nextInt();
	String string= scanner.nextLine();
	System.out.println("ID \t"+"Student Name \t"+ "Email ID");
	for(int i=0;i<id.length;i++)
	{
		System.out.println(id[i]+"\t"+name[i]+"\t" +email[i]);	
	}
	System.out.println(number2+""+string);
	break;
	
case 4:
		System.out.println("3.Delete Students by id :");
		int number3 = scanner.nextInt();
		while(id[number3]!=-1)
		{
			System.out.println("The index element which removed is:"+number3);
			System.out.println(id[number3]+"      "+name[number3]+"\t       "  +email[number3]);
			break;
		}
		System.out.println("Enter Your Choice :");
		scanner.nextInt();
		
case 5:
	System.out.println("4.Exit ");
	break;
	
default:System.out.println("No Such Records Found :\n");	
}}
}

