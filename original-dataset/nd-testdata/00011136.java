class Main {
    public static void main(String[] args) {
        // Block 1:
        String S = "level";
        // Block 2:
        int N = S.length();
        // Block 3:
        String one = S.substring(0, (N - 1) / 2);
        // Block 4:
        String two = S.substring((N + 3) / 2 - 1);
        // Block 5:
        if (S.equals(new StringBuilder(S).reverse().toString())) {
            // Block 6:
            if (one.equals(new StringBuilder(one).reverse().toString())) {
                // Block 7:
                if (two.equals(new StringBuilder(two).reverse().toString())) {
                    // Block 8:
                    System.out.println("Yes");
                    // Block 9:
                    System.exit(0);
                }
            }
        }
        // Block 10:
        System.out.println("No");
        // Block END.
    }
}
