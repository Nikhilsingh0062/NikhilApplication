package Sample;

import java.util.Scanner;

public class BankingApp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for subtraction");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter 4 for division");
		System.out.println("enter 5 for modules");
		int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("you are in addition block");
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println(sum);
		break;
		case 2:System.out.println("you are in multiplication block");
		System.out.println("enter the first number");
		int num3=sc.nextInt();
		System.out.println("enter the second number");
		int num4=sc.nextInt();
		System.out.println(num3-num4);
		break;
		
		case 3:System.out.println("you are in subtraction block");
		System.out.println("enter the first number");
		int num5=sc.nextInt();
		System.out.println("enter the second number");
		int num6=sc.nextInt();
		System.out.println(num5*num6);
		break;
		
		case 4:System.out.println("you are in division block");
		System.out.println("enter the numerator");
		int num7=sc.nextInt();
		System.out.println("enter the denominator");
		int num8=sc.nextInt();
		System.out.println(num7/num8);
		break;
		case 5:System.out.println("you are in division block");
		System.out.println("enter the first number");
		int num9=sc.nextInt();
		System.out.println("enter the second number");
		int num10=sc.nextInt();
		System.out.println(num9%num10);
		break;
		default:System.err.println("invalid");
		}
		
		
	}
}