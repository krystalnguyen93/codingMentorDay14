package day14;

public class fibonacci {
	public static void main(String[] args) {
		int n = 10;
	    int[] fib = new int[n + 1];
	    System.out.println(findFibonacci(n, fib));
	}

	private static int findFibonacci(int n, int[]fib) {
	    if (n == 0) {
	        return 0;
	    }
	    if (n == 1 || n == 2) {
	        fib[n] = 1;
	        return fib[n];
	    }
	    if (fib[n] != 0) {
	        return fib[n];
	    }
	    int k = (n + 1) / 2;
	    int a = findFibonacci(k, fib);
	    int b = findFibonacci(k - 1, fib);
	    if (n % 2 == 1) {
	        fib[n] = a * a + b * b;
	    } else {
	        fib[n] = a * (2 * b + a);
	    }
	    return fib[n];
	}
}
