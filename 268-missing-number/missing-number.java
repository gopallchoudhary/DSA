class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int freqMap[] = new int[n+1];
        for(int num: nums) {
            freqMap[num]++;
        }

        for(int i=0; i<freqMap.length; i++) {
            if(freqMap[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}