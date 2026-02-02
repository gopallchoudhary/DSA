class Solution {
    public int fib(int n) {
        // if(n<=1) {
        //     return n;
        // }
        // else {
        //     return fib(n-1) + fib(n-2);
        // }
        if(n<=1) {
            return n;
        }

        int fib[] = new int[n+1];
        fib[1] = fib[2] = 1;
        for(int i=3; i<=n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];

    }
}