class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 6;
        // Block 2:
        String s = ")))())";
        // Block 3:
        int R = 0, L = 0;
        // Block 4:
        for (int i = 0; i < s.length(); i++) {
            // Block 5:
            if (s.charAt(i) == '(') {
                // Block 6:
                R += 1;
            }
            // Block 7:
            else {
                // Block 8:
                if (R > 0) {
                    // Block 9:
                    R -= 1;
                }
                // Block 10:
                else {
                    // Block 11:
                    L += 1;
                }
            }
        }
        // Block 12:
        System.out.print("(".repeat(L) + s + ")".repeat(R));
        // Block END.
    }
}
