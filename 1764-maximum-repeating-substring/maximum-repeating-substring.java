class Solution {
    public int maxRepeating(String sequence, String word) {
        int counter = 0;
        StringBuilder repeatingWord = new StringBuilder(word);
        while(sequence.contains(repeatingWord)) {
            counter++;
            repeatingWord.append(word);
        }

        return counter++;
    }
}