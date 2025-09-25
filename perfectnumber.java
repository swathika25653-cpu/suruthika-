package com.p1;

public class perfectnumber {

	public static void main(String[] args) {
		int n=13;
		int sum=0;
		int i=1;
		while(i<n/2){
			if(n%i==0){
				sum+=i;
			}
			i++;
		}
		if(sum==n){
			System.out.println("perfect number");
		}
		else{
			System.out.println("not");
		}
		// TODO Auto-generated method stub
		

	}

}
