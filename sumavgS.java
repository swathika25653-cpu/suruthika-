package com.p1;
import java.util.Scanner;

public class sumavgS {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		System.out.println("enter the second number:");
		int num2=sc.nextInt();
		int sum=num1+num2;
		double avg=sum/2.0;
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
		sc.close();
		// TODO Auto-generated method stub

	}

}
