public static boolean oneAway(String input, String target) {
    int moves = 0;
    // increase moves for each insert and remove (size difference)
    moves += Math.abs(target.length() - input.length());
    if(moves > 1) {
        return false;
    }
    // increase moves for each replace
    for(int i = 0; i < input.length() && i < target.length(); i++) {
        if(input.charAt(i) != target.charAt(i)) {
            moves++;
            if(moves > 1) {
                return false;
            }
        }
    }
    return true;
}
