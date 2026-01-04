class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       int n=arr1.length;
       int m = arr2.length;
       int max = 0;
       
       // find the max of arr1
       for(int nums: arr1) {
        max = Math.max(max, nums);
       }

       // count array
       int countArr[] = new int[max+1];

       //map the freq
       for(int i=0; i < n; i++) {
        countArr[arr1[i]]++;
       }

       int result[] = new int[n];

       int j=0;
       for(int i=0; i < m; i++) {
        while(countArr[arr2[i]] > 0) {
            result[j] = arr2[i];
            j++;
            countArr[arr2[i]]--;
        }
       }

       for(int i=0; i < max+1; i++) {
        while(countArr[i] > 0) {
            result[j] = i;
            j++;
            countArr[i]--;
        }
       }

       return result;
    }
}

