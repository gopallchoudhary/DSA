class Solution {
    public int countSegments(String s) {
        s = s.replaceAll("\\s+", " ").trim();
        if(s.length() == 0) {
            return 0;
        }
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }
}