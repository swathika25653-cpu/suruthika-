package com.p1;

public class findindexarray {

	public static void main(String[] args) {
		int nums[]={1,3,5,6};
		int target=5;
		int index=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>=target){
				index=i;
				break;
			}
			index=i+1;
			
		}
		System.out.println("output="+index);
		
		// TODO Auto-generated method stub

	}

}
