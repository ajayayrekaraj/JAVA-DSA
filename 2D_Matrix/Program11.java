/* Given a Matrix of N*N
   Rotate the matrix 90 degree clockwise
   from the top-right corner.
Note:(no new Matrix) */

class Clockwise_Matrix{
	public static void main(String[]args){

		int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr[0].length;j++){
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}

		for(int i=0;i<arr.length;i++){
			int start=0;
			int end=arr.length-1;

			while(start<end){
				int temp=arr[i][start];
				arr[i][start]=arr[i][end];
				arr[i][end]=temp;

				start++;
				end--;
			}
		}

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
