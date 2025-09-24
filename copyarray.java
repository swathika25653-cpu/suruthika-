package com.p1;

public class copyarray {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		int[]copy=new int[a.length];
		for(int i=0;i<a.length;i++){
			copy[i]=a[i];
			
		}
		System.out.println("copied array:");
		for(int i:copy){
			System.out.print(i +" ");
		}
		
		
		

	}

}
