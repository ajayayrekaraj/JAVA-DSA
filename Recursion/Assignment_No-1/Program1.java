//1. WAP to print the numbers between 1 to 10.

class Recursion{
	int printNum(int num){
		if(num==11)
			return 0;
		System.out.println(num);

		return printNum(++num);

	}
	public static void main(String[]args){
		Recursion obj=new Recursion();
		obj.printNum(1);
	}
}


