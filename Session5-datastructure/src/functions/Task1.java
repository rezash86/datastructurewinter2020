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
	
	public int findMax(int[] arr, int n) {
		//try to put out one element of the list
		// and compare it with the whole
		if(n==1) {
			return arr[0];
		}
		
		return Math.max(arr[n-1], findMax(arr, n-1));
	}
	
	public int binarySearchRec(int[] arr, int first, int last, int key) {
		
		if(first<=last) {
			int middle = (first + last )/2;
			
			if(arr[middle] == key) {
				return middle;
			}
			
			if(arr[middle] > key) {
				return binarySearchRec(arr, first, middle - 1, key);
			}
			
			return binarySearchRec(arr, middle + 1, last, key);

		}
		
		return -1;
	}
	
	//chihichi
	public int countHi(String str) {
		//exit condition
		if (str.length() < 2) {
			return 0;
		}
		
		//check the count
		if(str.substring(0, 2).equals("hi")) {
			return 1 + countHi(str.substring(2));
		}
		
		//if it wasn't hi, we removed the first character
		return countHi(str.substring(1));
	}
	
	public String changeXY(String str) {
		if (str.length() == 0) {
			return "";
		}
		
		if (str.charAt(0) == 'X') {
			return 'Y' + changeXY(str.substring(1));
		}
		return str.charAt(0) + changeXY(str.substring(1));
	}
	
	//FXYUUUX
	public String removeX(String str) {
		//imagin you have only one X and another char
		if(str.length() < 1) {
			return str;
		}
		
		if (str.charAt(0) == 'X') {
			return removeX(str.substring(1));
		}
		return str.charAt(0) + removeX(str.substring(1));
		
	}
	
	
	
}
