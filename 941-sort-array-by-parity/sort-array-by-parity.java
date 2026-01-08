class Solution {
    public int[] sortArrayByParity(int[] nums) {
     ArrayList<Integer> evenNumbers = new ArrayList<>();
      ArrayList<Integer> oddNumbers = new ArrayList<>();

        for(int n: nums) {
            if(n % 2 == 0) {
                evenNumbers.add(n);
            } else {
                oddNumbers.add(n);
            }
        }

        int result[] = new int[nums.length];
        int index = 0;
        for(int n: evenNumbers) {
            result[index++] = n;
        }

        for(int n: oddNumbers) {
            result[index++] = n;
        }

        return result;
    }
}