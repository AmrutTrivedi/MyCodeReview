
public interface Printer {
int a=12;
void show();
}
interface Shower extends Printer{
	void print();
}
class Applet implements Printer,Shower{
	public void show() {
		System.out.println("Hello Shower");
	}
	public void print() {
		System.out.println("Hello Printer");
	}
public static void main(String args[]) {
		Applet A1 = new Applet();
		A1.show();	
		A1.print();
}
}