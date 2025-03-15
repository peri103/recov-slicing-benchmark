class Main {
    public static void main(String[] args) {
        // Block 1:
        String S = "level";
        // Block 2:
        boolean T = true;
        // Block 3:
        for (int i = 0; i <= (S.length() - 2) / 2 - 1; i++) {
            // Block 4:
            if (S.charAt(i) != S.charAt(S.length() - 1 - i)) {
                // Block 5:
                T = false;
            }
        }
        // Block 6:
        for (int i = 0; i <= (S.length() - 3) / 4; i++) {
            // Block 7:
            if (S.charAt(i) != S.charAt((S.length() - 3) / 2 - i)) {
                // Block 8:
                T = false;
            }
        }
        // Block 9:
        if (T == false) {
            // Block 10:
            System.out.println("No");
        // Block 11:
        } else {
            // Block 12:
            System.out.println("Yes");
        }
        // Block END.
    }
}
