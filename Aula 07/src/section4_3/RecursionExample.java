package section4_3;

public class RecursionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fatorial(6));
		//recurseMethod(4);
		System.out.println(fibonacci(10));
		
	}
	
	/*
	 * public static int fatorialCode(int num) {
	 * 
	 * int result=num;
	 * 
	 * for (int i=num-1;i>0;i--) { result*=i;
	 * 
	 * } return result; }
	 */
	
	public static int fatorial(int num) {
		
		if(num<=1) {
			return 1;
		}
		return num*(fatorial(num-1));
	}
	
	public static void recurseMethod(int num) {
		
		if(num==0) {
			return;
		}else {
			System.out.println("Hello "+num);
			recurseMethod(num-1);
			System.out.println(""+num);
			return;
		}
	}
	
	public static int fibonacci(int index) {
		int []fib=new int[index];
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2;i<index;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		
		return fib[index-1];
	
	}
}
