class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        int sortedArray[] = new int[nums.length];
        for(int n: nums) {
            if(n % 2 == 0) {
                sortedArray[k++] = n;
            }
        }

        for(int n: nums) {
            if(n % 2 != 0) {
                sortedArray[k++] = n;
            }
        }
        return sortedArray;
    }
}