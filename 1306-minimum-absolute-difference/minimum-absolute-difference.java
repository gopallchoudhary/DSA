class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        
        int minimum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
            minimum = Math.min(arr[i+1] - arr[i], minimum);
        }

        for(int i=0; i<n-1; i++) {
            
            if(arr[i+1] - arr[i] == minimum) {
                list.add(List.of(arr[i], arr[i+1]));
                
            }
        }
        

        
        return list;
    }
}