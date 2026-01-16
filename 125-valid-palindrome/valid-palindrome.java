class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        int first = 0;
        int last = s.length()-1;
        while(first<=last) {
            char firstChar = s.charAt(first);
            char lastChar = s.charAt(last);

            //check for the special character or digit
            if(!Character.isLetterOrDigit(firstChar)) {
                first++; continue;
            }

            if(!Character.isLetterOrDigit(lastChar)) {
                last--; continue;
            }

            
            if(Character.toLowerCase(firstChar) != Character.toLowerCase(lastChar)) {
                return false;
            }
                first++;
                last--;
        }
        return true;
    }
}