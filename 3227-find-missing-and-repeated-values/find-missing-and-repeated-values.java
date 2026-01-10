class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] nums = new int[n*n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nums[k++] = grid[i][j];
            }
        }
        // Optimal Equation Solution
        n = nums.length;
        long S =  ((long) n * (n+1))/2;
        long S2 = ((long) n * (n+1)* (2*n+1)) / 6;

        long Sn = 0;
        long S2n = 0;
        for(int i=0;i<n;i++){
            Sn += nums[i];
            S2n += (long) nums[i] * (long) nums[i];
        }

        long val1 = S - Sn;
        long val2 = S2 - S2n;

        val2 = val2/val1;

        long x = (val1+val2) / 2;
        long y = x - val1;

        return new int[]{(int)y, (int)x};
    }
}