import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       int n = arr1.length;
       boolean used[] = new boolean[n];
       List<Integer> result = new ArrayList<>();

       for(int num: arr2) {
        for(int i=0; i<n; i++) {
            if(num == arr1[i] &&  !used[i]) {
                result.add(num);
                used[i] = true;
            }
        }
       }

        List<Integer> remaining = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(!used[i]) {
                remaining.add(arr1[i]);
            }
        }
       

       Collections.sort(remaining);
       result.addAll(remaining);

       for(int i=0; i<n; i++) {
        arr1[i] = result.get(i);
       }

       return arr1;

    }
}

