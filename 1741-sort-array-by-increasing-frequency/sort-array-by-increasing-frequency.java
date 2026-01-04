class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int num: nums) {
            list.add(num);
        }

        Collections.sort(list, (a,b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);

            if(freqA != freqB) {
                return freqA - freqB;
            } else {
                return b-a;
            }
        });

        for(int i=0; i<nums.length; i++) {
            nums[i] = list.get(i);
        }

        return nums;
    }
}