package dynamic_programming;

public class Dynamic_ProgrammingEx {
	// why we have to use DP?
	// Naive Recursion is similar with Dynamic Programming
	// But , in Naive Recursion , the same operations may be repeated unnecessarily
	// So we used to DP to save runtime
	
	// DP has two way
	// First, Memoization ( Top-down )
	// Second, Tabulation ( Bottom-up )
	static int [] top_down;
	static int [] bottom_up;
	public static void main(String[] args) {
		// For example with Fibonacci
		int n = 30;
		top_down = new int [n+1];
		bottom_up = new int [n+1];
		long startTime = System.currentTimeMillis();
		System.out.print("naiveRecursion : "+naiveRecursion(n));
		long endTime = System.currentTimeMillis();
		System.out.println("\tRuntime : "+(endTime-startTime));
	
		startTime = System.currentTimeMillis();
		System.out.print("topDown : "+topDown(n));
		endTime = System.currentTimeMillis();
		System.out.println("\tRuntime : "+(endTime-startTime));
	
		startTime = System.currentTimeMillis();
		System.out.print("bottomUp : "+bottomUp(n));
		endTime = System.currentTimeMillis();
		System.out.println("\tRuntime : "+(endTime-startTime));
		
	}
	
	public static int naiveRecursion(int n){
        if(n <= 1){
            return n;
        }
        return naiveRecursion(n-1) + naiveRecursion(n-2);
    }
	
	public static int topDown(int n){
        if(n < 2) return top_down[n] = n;
        if(top_down[n] > 0) return top_down[n];
        top_down[n] = topDown(n-1) + topDown(n-2);
        return top_down[n];
    }
	
    public static int bottomUp(int n){
    	bottom_up[0] = 0; bottom_up[1] = 1;
        for(int i=2; i<=n; i++){
        	bottom_up[i] = bottom_up[i-1] + bottom_up[i-2];
        }
        return bottom_up[n];
    }
}
