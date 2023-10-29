//2. WAP to display the first 10 natural numbers in reverse order.

class Recursion{
	int ReverseData(int num){
		if(num==0)
			return 0;

		System.out.println(num);

		return ReverseData(--num);
	}
	public static void main(String[]args){
		Recursion obj=new Recursion();
		obj.ReverseData(10);
	}
}
