package Sample;
import java.util.Scanner;



class ing{

	//public static void main(String[] args){ 
		// TODO Auto-generated method stub
private String Accountno;
private String Name;
private String Accounttype;
private long Balance;
	
Scanner sc=new Scanner(System.in);
public void OpenAccount() {
System.out.print("enter Account No:");
Accountno =sc.next();
System.out.print("Name");
Name =sc.next();
System.out.print("Account type");
Accounttype=sc.next();
System.out.print("enter balance");
Balance =sc.nextLong();
	}
public void AccountShow() {
	System.out.println("name of account:" + Name);
	System.out.println("AccountType:"+ Accounttype);
	System.out.println("AccountNo.:"+ Accountno);
	System.out.println("Account Balance"+ Balance);
	
}
public void deposit() {
	Long Amount;
	System.out.print("Enter the Amount you want to deposit");
	Amount =sc.nextLong();
	Balance=Balance+Amount;
}
public void Withdrawal() {
	long Amount;
	System.out.println("enter the amount you want to withdraw");
	Amount =sc.nextLong();
	if(Balance>=Amount) {
		Balance=Balance-Amount;
		System.out.println("Balance After Withdrawal:"+ Balance);
	}
	else {System.out.println("your balance is less than"+Amount+"\tTransaction Failed...!");
	
	}
}
public Boolean Search (String Accountno){
	if (Accountno.equals(Accountno)) {
		//ShowAccount();
		return(true);
	}
	return(false);
	
}
public void BankDetails() {
	// TODO Auto-generated method stub
	
}
public void withdrawal() {
	// TODO Auto-generated method stub
	
}

}
public class BankingApp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("how many customers do you want to input?");
		int n=sc.nextInt();
		BankDetails C[]= new BankDetails[n];
		for(int i=0;i<C.length;i++) {
			C[i]=new BankDetails();
			C[i].OpenAccount();
			}
		int ch;
		do {
			System.out.println("\n***Banking System Application***");
			System.out.println("1.Display all account details\n 2.Search by Account number\n 3.Deposit the amountn\n 4.Withdraw the amountn\n5.exit");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch){
			case 1:for (int i=0;i<C.length;i++) {
				C[i].BankDetails();
			}
			break;
			case 2:
			System.out.print("Enetr Account no. you want to search");
			String Accountno=sc.next();
			boolean found=false;
			for(int i=0;i<C.length;i++) {
				found=C[i].Search(Accountno);
				if(found) {
					break;
				}
			}
			if(!found) {
				System.out.println("Search failed! Account doesn't exixt..!!");
			}
			break;
			case 3:
				System.out.println("Enter Account no:");
				Accountno =sc.next();
				found=false;
				for(int i=0;i<C.length;i++) {
				found=C[i].Search(Accountno);
				if(found) {
					C[i].deposit();
					break;
				}
			}
			if(!found){
				System.out.println("Search failed! Account doesn't exist..!!");
			}
			break;
			case 4:
				System.out.println("Enetr Account no:");
				Accountno=sc.next();
				found=false;
				for(int i=0;i<C.length;i++) {
					found=C[i].Search(Accountno);
					if(found) {
						C[i].withdrawal();
				break;
					
		}
	}
				if(!found) {
					System.out.println("search failed! Account doesn't exist..!!");
				}
				break;
			case 5:
				System.out.println("see you soon...");
				break;
		}
	}
	while(ch!=5);
}	

}

