class Solution {
    public int minTimeToType(String word) {
        int n = word.length();
        char prev = 'a';
        int min = 0;
        for(int i=0; i<n; i++) {
            char current = word.charAt(i);
            int diff = Math.abs(prev-current);
            min += Math.min(diff, 26-diff);
            prev = current;
        }
        return min + n;
    }
}