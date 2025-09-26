

public class traversing {

	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60};
		System.out.println("forward alternative element");
		for(int i=0;i<arr.length;i+=2){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("backward alternative element");
			for(int i=arr.length-1;i>=0;i-=2){
				System.out.println(arr[i]+" ");

				
			}
	}
	}