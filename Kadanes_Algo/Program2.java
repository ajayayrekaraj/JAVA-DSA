class Subarray{
	public static void main(String[]args){
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};

		int sum=0;
		int StartIndex=-1;
		int EndIndex=-1;
		int x=-1;
		int maxSum=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			if(sum==0)
				x=i;

			sum=sum+arr[i];

			if(sum>maxSum){
				maxSum=sum;
				StartIndex=x;
				EndIndex=i;
			}

			if(sum<0)
				sum=0;
		}
		System.out.println(maxSum);

		for(int i=StartIndex;i<=EndIndex;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

