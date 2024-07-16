package Sample;
import java.util.Scanner;
public class banksample {

	public void Acc_search(long accnum) {
		System.out.println("searched based on acc_num");
		// TODO Auto-generated method stub
	}
	public void Acc_search(long accNum,String accName) {
		System.out.println("search based on acc_num and acc_name");
	}
	public void Acc_search(String pan) {
		System.out.println("searched based on pan number");
	}
	public static void main (String[] args) {
		banksample b=new banksample();
		//we can  type the 
		java.util.Scanner sc=new Scanner(System.in);
		System.out.println("press 1 to search account details based on acc_Number");
		System.out.println("press 2 to search account details based on acc_Number and acc_name");
		System.out.println("press 3 to search account details based on pan_Number");
		System.out.println("==========================================");
		int num=sc.nextInt();
		if(num==1) {
			System.out.println("enter acc_num");
			long accNum1=sc.nextLong();
			b.Acc_search(accNum1);
		}
		else if(num==2) {
			System.out.println("enter pan_num");
			String name=sc.next();
			b.Acc_search(accNum1,name);
		}
		else if(num==3) {
			System.out.println("enter pan_num");
			String name=sc.next();
			b.Acc_search(name);
		}
		else {
			System.out.println("press correct number");
		}
		sc.close();
		
	}

}
