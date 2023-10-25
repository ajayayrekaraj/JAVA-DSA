//print 1 to 10 using recursion 

class Recursion{
	static void PrintNum(int num){
		if(num<1)
			return;
		PrintNum(num-1);
		System.out.println(num);
}
   static public void main(String[]args){
	   int num=10;
	   PrintNum(num);
	   System.out.println(num);
   }

}

