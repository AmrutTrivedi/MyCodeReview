import java.io.IOException;
public class CheckExcep 

{
void m() throws IOException{
	throw new IOException("Device Error");
}
void n()throws IOException{
	m();
	
}
void p() {
	try {
		n();
		}catch(Exception e)
	{
			System.out.println("Exception Handled");		
	}
}
public static void main(String args[]) {
CheckExcep obj = new CheckExcep();
obj.p();
System.out.println("Normal Flow");
}}