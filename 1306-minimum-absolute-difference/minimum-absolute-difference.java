class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        
        int minimum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
            int diff = Math.abs(arr[i] - arr[i+1]);
            minimum = Math.min(diff, minimum);
        }

        for(int i=0; i<n-1; i++) {
            int currentDiff = arr[i+1] - arr[i];
            if(currentDiff == minimum) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                list.add(pair);
                
            }
        }
        

        
        return list;
    }
}