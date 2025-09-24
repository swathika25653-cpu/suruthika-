package com.p1;

import java.util.Scanner;

public class trianglearea {
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base:");
        int b=sc.nextInt();
        System.out.println("enter the height:");
        int h=sc.nextInt();
        double area=1/2*b*h;
        System.out.println("area of the rectangle:"+area);
         sc.close();


}
}
