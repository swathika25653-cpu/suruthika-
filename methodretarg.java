package com.p1;
import java.util.Scanner;
class retargtype{
	public void sub(int x,int y){
		
		System.out.println("substraction="+(x-y));
		
		// TODO Auto-generated method stub

	}

}
 public class methodretarg{
	 public static void main(String args[]){
		 retargtype o=new retargtype();
		 Scanner s=new Scanner(System.in);
		 int a=s.nextInt();
		 int b=s.nextInt();
		 o.sub(a,b);
	 }
	 
 }
