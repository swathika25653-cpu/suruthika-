package com.p1;
import java.util.Scanner;

public class areacircle {
	public static void main(String[] args){
		double PI=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		double radius=sc.nextDouble();
		double area=PI*radius*radius;
		System.out.println("area:"+area);
		sc.close();

	}

}
