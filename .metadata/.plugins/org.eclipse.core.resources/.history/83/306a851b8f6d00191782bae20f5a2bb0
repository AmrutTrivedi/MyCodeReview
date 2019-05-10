class Table111 {
synchronized void print(int n) {
	for(int i=1;i<=5;i++)
	{
		System.out.println(n*i);
	}
try {
	Thread.sleep(500);
}catch(Exception e)
{
	System.out.println(e);
}
}
}
class MyThread1 extends Thread{
	Table111 t;
	MyThread1(Table111 t1)
	{
		t = t1;	
	}
public void run() {
System.out.println(5);	
}
}
class MyThread2 extends Thread{
	Table111 t;;
	MyThread2(Table111 t2)
	{
		t=t2;
	}
public void run()
{
	System.out.println(500);
}
}
class TestSync{
	public static void main(String args[])
	{
		Table111 obj = new Table111();
		MyThread1 t3 = new MyThread1(obj);
		MyThread2 t4 = new MyThread2(obj);
		t3.start();
		t4.start();
		
		
	}
}
