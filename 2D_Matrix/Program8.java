// Given a Square Matrix print the right diagonal

class Right_Diagonal{
	public static void main(String[]args){
		int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
			while(i<arr.length && j>0){
				System.out.println(arr[i][j]);
				i++;
				j--;
			}
		}
		}
	}
}

