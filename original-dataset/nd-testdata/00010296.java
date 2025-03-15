class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 6;
        // Block 2:
        String s = ")))())";
        // Block 3:
        String ss = s;
        // Block 4:
        int l = 0;
        // Block 5:
        for (char c : ss.toCharArray()) {
            // Block 6:
            if (c == '(') {
                // Block 7:
                l += 1;
            }
            // Block 8:
            else {
                // Block 9:
                if (l > 0) {
                    // Block 10:
                    l -= 1;
                }
                // Block 11:
                else {
                    // Block 12:
                    s = "(" + s;
                }
            }
        }
        // Block 13:
        for (int i = 0; i < l; i++) {
            // Block 14:
            s = s + ")";
        }
        // Block 15:
        System.out.println(s);
        // Block END.
    }
}
