//Bubble Sort
//User Given Values
import java.util.*;

class Sort{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Numbers:");
		int Number=sc.nextInt();
		int arr[]=new int[Number];

		for(int i=0;i<arr.length;i++){
			arr [i]=sc.nextInt();
		}
	

	       boolean swapped;
                 for(int i=0;i<arr.length;i++){
			 swapped=false;
	              for(int j=0;j<arr.length-i-1;j++){
                              if(arr[j]>arr[j+1]){
	                          int temp=arr[j];
                               	  arr[j]=arr[j+1];
	                          arr[j+1]=temp;
				  swapped=true;
			      }
		      }
		      if(swapped==false)
			      break;
		 }
		 for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+ " ");
		 }
		 System.out.println();
	}
}


