package com.p1;

class division{
	public float div(int x,int y){
		return(x/y);
	}

}
class withretwitharg{
	public static void main(String args[]){
		division o=new division();
		System.out.println("division="+o.div(150, 4));
	}
}