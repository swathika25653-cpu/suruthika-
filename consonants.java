package com.p1;
import java.util.Scanner;

public class consonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
			 char ch=Character.toLowerCase(str.charAt(i));
			 if(ch>='a'&&ch<='z'&&!(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'));{
				 count++;
				 
			 }
			    }
		 System.out.println("number of consonant="+count);
		 
		
		// TODO Auto-generated method�stub	
		}

}