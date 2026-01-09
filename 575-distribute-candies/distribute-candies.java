import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int c: candyType) {
            set.add(c);
        }

        int n = (candyType.length)/2;
        int m = set.size();
        if(n < m) {
            return n;
        } else {
            return m;
        }
     }
}