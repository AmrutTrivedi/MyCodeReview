import java.util.*;
public class StudentManagement1 {
public static void main(String args[]) {
	
		MyClass m1 = new MyClass(0,"Amit","amit12@gmail.com");
		MyClass m2 = new MyClass(1,"Amrut","amrut31@gmail.com");
		MyClass m3 = new MyClass(2,"Ram","ram30@gmail.com");
		MyClass m4 = new MyClass(3,"Rajesh","rajesh08@gmail.com");
	
		ArrayList<MyClass> a = new ArrayList<MyClass>();
		{
		a.add(0,m1);
		a.add(1,m2);
		a.add(2,m3);
		a.add(3,m4);
		
		System.out.println("Enter your choices :");
		System.out.println("1.List no of students :");
		System.out.println("2.Student Details by Id :");
		System.out.println("3.Delete students by id :");
		System.out.println("4.Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice :");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("1.List number of students :");
			System.out.println("ID \t"+"Student Name \t"+  "Email ID"); 
		    Iterator i = a.iterator();
		    while(i.hasNext())
		    {
			MyClass m = (MyClass)i.next();
			System.out.println(m.id+"\t"+m.name+"        \t     "+m.email);	
		    }
			System.out.println("Enter Your Choice :");
			int num2 = sc.nextInt();
  
		case 2:
			System.out.println("2.Get Student Details by id :");
			System.out.println("Enter Student Id");
			int id =sc.nextInt();
			a.get(id);
			System.out.println("ID  \t"+  "Student Name \t"+     "Email ID");
			Iterator itr = a.listIterator(id);
				MyClass m = (MyClass)itr.next();
				System.out.println(m.id+"\t"+m.name+"        \t     "+m.email);	
				System.out.println("Enter Your Choice :");
				int num3 = sc.nextInt();
		   
		case 3:
			System.out.println("3.Delete Student Details by id :");
			System.out.println("Enter Student Id");
			int n1 = sc.nextInt();
			a.remove(n1);
			System.out.println("After Removing :");
			System.out.println("ID  \t"+  "Student Name \t"+     "Email ID");
			Iterator i2 = a.iterator();
			    while(i2.hasNext())
			    {
				MyClass myclass = (MyClass)i2.next();
				System.out.println(myclass.id+"\t"+myclass.name+"      \t     "+myclass.email);	
			    }
				System.out.println("Enter Your Choice :");
				int number = sc.nextInt();

		case 4:
			System.out.println("4.Exit ");
			break;
			
		default:System.out.println("No Such Records Found :\n");	
		}}}}

