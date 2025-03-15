class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 3;
        // Block 2:
        String S = "())";
        // Block 3:
        int l = 0;
        // Block 4:
        int r = 0;
        // Block 5:
        for (char c : S.toCharArray()) {
            // Block 6:
            if (c == '(') {
                // Block 7:
                l += 1;
            }
            // Block 8:
            else {
                // Block 9:
                if (l != 0) {
                    // Block 10:
                    l -= 1;
                }
                // Block 11:
                else {
                    // Block 12:
                    r += 1;
                }
            }
        }
        // Block 13:
        System.out.println("(".repeat(r) + S + ")".repeat(l));
        // Block END.
    }
}
