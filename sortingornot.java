import java.util.*;
public class sortingornot {

	public static void main(String[] args) {
		int arr[]=new int[100];
		int size;
		int asc=1;int dsc=1;
		System.out.println("enter the size");
		Scanner s=new Scanner(System.in);	
		size=s.nextInt();
		System.out.println("enter the array value=");
		for(int i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size-1;i++){
			if(arr[i]>arr[i+1])
				asc=0;
			else if(arr[i]<arr[i+1])
				dsc=0;
				
		}
		if(asc==0&&dsc==0){
			System.out.println("not sorted");
		}
		else{
			System.out.println("sorted");
		}
		// TODO Auto-generated method stub

	}

}
