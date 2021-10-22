package basic;

public class Demo {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int result = add(a,b);
		System.out.println(result);
		
	}
	
	public static int add(int...aa) {
		int sum=0;
		for(int d : aa) {
			sum = sum+d;
		}
		return sum;
	}
}
