package com.p1;
class methods{

	public int mul() {
		int a= 10;
		int b=20;
       return(a*b);
       
		// TODO Auto-generated method stub

	}

}
class withretwithoarg{
	public static void main(String args[]){
		methods o=new methods();
		int x=o.mul();
		System.out.println(x);
	}
}
