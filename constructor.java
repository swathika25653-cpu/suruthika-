package com.p1;

public class constructor {
	int length,breadth;
	constructor(int x,int y){
		length=x;
		breadth=y;
		
	}
           int area(){
        	   return length*breadth;
           }
           
	public static void main(String[] args) {
		constructor c1=new constructor(9,6);
		System.out.println(c1.area());
		// TODO Auto-generated method stub

	}

}
