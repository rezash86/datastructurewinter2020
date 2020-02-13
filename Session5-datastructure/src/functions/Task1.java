package functions;

public class Task1 {

	// 5 4 3 2 1 1 2 3 4 5
	public void recFun(int number) {
		if (number < 1) {
			return;
		}
		System.out.println(number);
		recFun(number - 1);
		System.out.println(number);
	}

	public long fib(int n) {
		if(n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	public int fact(int n) {
		//6! = 6 * 5!
		if(n==1) {
			return 1;
		}
		return n * fact(n-1);
	}
	
	public int power(int base, int n) {
		//base ^ n  = base * base^ n-1
		if(n==0) {
			return 1;
		}
		return base * power(base, n-1);
	}
}
