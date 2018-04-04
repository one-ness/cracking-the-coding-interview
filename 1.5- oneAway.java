public static boolean oneAway(String input, String target) {
    int moves = 0;
    for(int i = input.length(); i < target.length(); i++) {
        moves++;
        if(moves > 1) {
            return false;
        }
    }
    for(int i = input.length(); i > target.length(); i--) {
        moves++;
        if(moves > 1) {
            return false;
        }
    }
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
