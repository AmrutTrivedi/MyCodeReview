
public class MulCatch1 {
public static void main(String args[]) {
	try {
			int a[] = new int [5];
			a[5]=30/0;
			
		}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic Exception Occurs");
		
	}
	try {
		int b[] = new int[6];
		b[6] =30/0;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfExceptions");
	}
	catch(Exception e)
	{
		System.out.println("ParentExceptionOccurs");
	}
	System.out.println("Rest Of The code");
}
}
