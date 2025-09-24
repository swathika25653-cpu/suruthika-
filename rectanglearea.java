package com.p1;
import java.util.Scanner;

public class rectanglearea {
       public static void main(String[] args){
	         Scanner sc=new Scanner(System.in);
	         System.out.println("enter the length:");
	         int length=sc.nextInt();
	         System.out.println("enter the breadth:");
	         int breadth=sc.nextInt();
	         double area=length*breadth;
	         System.out.println("area of the rectangle:"+area);
	          sc.close();
	
     }
}
