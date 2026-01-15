class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int frequency=0, count = 0;

        for(int n: nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        for(int val: freq.values()) {
            if(val == frequency) {
                count++;
            } else if(val > frequency) {
                frequency = val;
                count = 1;
            }
        }

        return frequency * count;
    }
}