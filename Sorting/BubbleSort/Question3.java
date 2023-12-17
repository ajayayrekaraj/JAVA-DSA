import java.util.*;

class Question{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);

		System.out.print("Enter Array Number:");
		int n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

                 int count=0;
		 boolean swap;

		for(int i=0;i<arr.length;i++){

			swap=false;
			for(int j=0;j<arr.length-i-1;j++){

				count++;
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(swap==false)
				break;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println(count);
	}
}


