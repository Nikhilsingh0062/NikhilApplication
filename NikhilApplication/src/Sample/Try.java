package Sample;
  import java.util.Scanner;  
	class BankDetails {  
	    private String Accountno;  
	    private String name;  
	    private String Accounttype;  
	    private long balance;  
	    Scanner sc = new Scanner(System.in);  
	    //method to open new account  
	    public void openAccount() {  
	        System.out.print("Enter Account No: ");  
	        Accountno = sc.next();  
	        System.out.print("Enter Account type: ");  
	        Accounttype = sc.next();  
	        System.out.print("Enter Name: ");  
	        name = sc.next();  
	        System.out.print("Enter Balance: ");  
	        balance = sc.nextLong();  
	    }  
	    //method to display account details  
	    public void showAccount() {  
	        System.out.println("Name of account holder: " + name);  
	        System.out.println("Account no.: " + Accountno);  
	        System.out.println("Account type: " + Accounttype);  
	        System.out.println("Balance: " + balance);  
	    }  
	    //method to deposit money  
	    public void deposit() {  
	        long amt;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amt = sc.nextLong();  
	        balance = balance + amt;  
	    }  
	    //method to withdraw money  
	    public void withdrawal() {  
	        long amt;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amt = sc.nextLong();  
	        if (balance >= amt) {  
	            balance = balance - amt;  
	            System.out.println("Balance after withdrawal: " + balance);
	            System.out.println("last amount withdraw by : " + name );
	        } else {  
	            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
	        }  
	    }  
	    //method to search an account number  
	    public boolean search(String ac_no) {  
	        if (Accountno.equals(ac_no)) {  
	            showAccount();  
	            return (true);  
	        }  
	        return (false);  
	    }  
	}  
	public class Try {  
	    public static void main(String arg[]) {  
	        Scanner sc = new Scanner(System.in);  
	        //create initial accounts  
	        System.out.print("How many number of customers do you want to input? ");  
	        int n = sc.nextInt();  
	        BankDetails C[] = new BankDetails[n];  
	        for (int i = 0; i < C.length; i++) {  
	            C[i] = new BankDetails();  
	            C[i].openAccount();  
	        }  
	        // loop runs until number 5 is not pressed to exit  
	        //xjjd
	        //jjgfjgoio9gfrijiorf
	        int ch;  
	        do {  
	            System.out.println("\n ***Banking System Application***");  
	            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	                switch (ch) {  
	                    case 1:  
	                        for (int i = 0; i < C.length; i++) {  
	                            C[i].showAccount();  
	                        }  
	                        break;  
	                    case 2:  
	                        System.out.print("Enter account no. you want to search: ");  
	                        String ac_no = sc.next();  
	                        boolean found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_no);  
	                            if (found) {  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 3:  
	                        System.out.print("Enter Account no. : ");  
	                        ac_no = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_no);  
	                            if (found) {  
	                                C[i].deposit();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 4:  
	                        System.out.print("Enter Account No : ");  
	                        ac_no = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_no);  
	                            if (found) {  
	                                C[i].withdrawal();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 5:  
	                        System.out.println("See you soon... ASAP"); 
	                        System.out.println("How do you like our work?"
	                        		+ "rate us on our website ");
	                        break;  
	                }  
	            }  
	            while (ch != 5);  
	        }  
	    }  