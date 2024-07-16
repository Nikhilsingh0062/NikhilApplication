package Sample;
public class learn{
	public void m1(int i) {
		System.out.println("m1 para is int type is super class");
		return;
	}
	public void m1(int i,String S) {
		System.out.println("m1 is para is int and String type super class");
		return;
	}
	public void m1(String S,double d) {
		System.out.println("m1 is para String and double type sub class");
		return;
	}
	public static void main(String[] args) {
		learn l=new learn();
		l.m1(10);
		l.m1(2,"nikhil");
		l.m1("code",2.5);
	}
}