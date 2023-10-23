class Slide{
	public static void main(String[]args){
		int arr[]=new int[]{-3,4,-2,5,3,-2,8,2,1,4};
		int k=4;

		int start=0;
		int end=k-1;
		int sum=0;
		int max=sum;

		for(int i=start;i<=end;i++){
			sum=sum+arr[i];
		}

		start=1;
		 end=k;
		while(end<arr.length){
			sum=sum-arr[start-1]+arr[end];

			if(sum>max){
				max=sum;
			}
			start++;
			end++;
		}
		System.out.println(max);
	}
}


