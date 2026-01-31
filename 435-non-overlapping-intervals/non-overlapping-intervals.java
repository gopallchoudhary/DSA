

class Solution {
    

    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int last = 0;
        int count = 1;
        for(int i=1; i<n; i++) {
            if(intervals[last][1] <= intervals[i][0]) {
                last = i;
                count++;
            }
        }

        return n-count;

    }
}