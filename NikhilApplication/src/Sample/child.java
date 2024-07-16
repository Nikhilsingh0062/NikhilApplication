package Sample;
//public class child extends parent {
	//	child(){
//super(10);
			//System.out.println("test is from c class");
		//}
	//public static void main (String[] args) {
		//child s=new child();
	//}
	//}
		
public class child extends parent{
	public void m1(String S,double d) {
		System.out.println("m1 para is string and double type sub class");
	}
	public static void main(String[]args) {
		child c=new child();
		c.m1(10);
		c.m1(2,"code");
		c.m1("java",2.5);
	}
}