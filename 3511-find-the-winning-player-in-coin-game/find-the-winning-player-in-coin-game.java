class Solution {
    public String winningPlayer(int x, int y) {
        boolean kiskaTurn = false;
        while(x > 0 && y >= 4) {
            kiskaTurn = !kiskaTurn;
            x -= 1;
            y -= 4;
        }

        return kiskaTurn ? "Alice" : "Bob";

    }
}