import java.util.*;
public class StudentManagement1 {
public static void main(String args[]) {
	
		MyClass myclass =  new  MyClass(0,"Amit","amit12@gmail.com",52);
		MyClass myclass1 = new MyClass(1,"Amrut","amrut31@gmail.com",63);
		MyClass myclass2 = new MyClass(2,"Ram","rammahes@gmail.com",89);
		MyClass myclass3 = new MyClass(3,"Rajesh","rajesh08@gmail.com",78);
		
		ArrayList<MyClass> array = new ArrayList<MyClass>();
		array.add(myclass);
		array.add(myclass1);
		array.add(myclass2);
		array.add(myclass3);
		
		int number1=0,number2=0,number3=0;
		int number4 = 0;
		int a;
		
		String string = null,strings = null;
		String s1,s2;
		
		System.out.println("Enter your choices :");
		System.out.println("1.List no of students :");
		System.out.println("2.Create Student details :");
		System.out.println("3.Student Details by Id :");
		System.out.println("4.Delete students by id :");
		System.out.println("5.Update student details by ID: ");
		System.out.println("6.Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice :");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("1.List number of students :");
			System.out.println("ID \t"+"Student_Name  \t"  +"Email ID   \t"+"Marks"); 
		    Iterator i = array.iterator();
		    while(i.hasNext())
		    {
			MyClass m = (MyClass)i.next();
			System.out.println(m.id+"\t"+m.name+" \t"+m.email+ "\t" +m.percentage);	
		    }
			System.out.println("Enter Your Choice :");
			int num1 = sc.nextInt();
			
		case 2:
			System.out.println("2.Create Student details :");
				System.out.println("ID \t"+"Student_Name  \t"  +"Email ID   \t"+"Marks"); 	
				number1 =sc.nextInt();
				string = sc.nextLine();
				Iterator itr1 = array.iterator();
			    while(itr1.hasNext())
			    {
				MyClass m = (MyClass)itr1.next();
				System.out.println(m.id+"\t"+m.name+" \t"+m.email+ "\t" +m.percentage);	
			    }
			    System.out.println(number1+"   "+string);
				break;
			
		case 3:
			System.out.println("3.Get Student Details by id :");
			System.out.println("Enter Student Id");
			int id1 =sc.nextInt();
			array.get(id1);
			System.out.println("ID \t"+"Student_Name  \t"  +"Email ID   \t"+"Marks"); 
			Iterator itr = array.listIterator(id1);
				MyClass m = (MyClass)itr.next();
				System.out.println(m.id+"\t"+m.name+" \t"+m.email+ "\t" +m.percentage);
				System.out.println("Enter Your Choice :");
				int num3 = sc.nextInt();
		   
		case 4:
			System.out.println("4.Delete Student Details by id :");
			System.out.println("Enter Student Id");
			int n1 = sc.nextInt();
			array.remove(n1);
			System.out.println("After Removing :");
			System.out.println("ID \t"+"Student_Name  \t"  +"Email ID   \t"+"Marks"); 
			Iterator i2 = array.iterator();
			    while(i2.hasNext())
			    {
				MyClass m1 = (MyClass)i2.next();
				System.out.println(m1.id+"\t"+m1.name+" \t"+m1.email+ "\t" +m1.percentage);	
			    }
				System.out.println("Enter Your Choice :");
				int num4 = sc.nextInt();
		
		case 5:
			System.out.println("5.Update student details by ID: ");
			int updateid =sc.nextInt();
			for(int i1=0;i1<updateid;i1++)
			{
				
			}
		case 6:
			System.out.println("6.Exit ");
			break;
			
		default:System.out.println("No Such Records Found :\n");	
		}}}

