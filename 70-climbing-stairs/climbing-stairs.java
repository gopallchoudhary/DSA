class Solution {
    public int ways(int n, int w[]) {
        if(n<=1) {
            return 1;
        }
        if(w[n] != 0) {
            return w[n];
        }
        w[n] = ways(n-1, w) + ways(n-2, w);
        return w[n];
    }
    public int climbStairs(int n) {
        int ways[] = new int[n+1];
        return ways(n, ways);
        
    }
}