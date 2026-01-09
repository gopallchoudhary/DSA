import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        int n = (candyType.length)/2;
        HashSet<Integer> set = new HashSet<>();
        for(int c: candyType) {
            set.add(c);
            if(set.size() == n) {
                return n;
            }
        }

        return set.size();
     }
}