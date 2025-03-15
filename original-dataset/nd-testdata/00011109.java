class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "akasaka";
        // Block 2:
        int n = s.length();
        // Block 3:
        int cnt = 0;
        // Block 4:
        String s1 = s.substring(0, (n - 1) / 2);
        // Block 5:
        String s2 = s.substring((n + 3) / 2 - 1, n);
        // Block 6:
        for (int i = 0; i < n / 2; i++) {
            // Block 7:
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                // Block 8:
                System.out.println("No");
                // Block 9:
                System.exit(0);
            }
            // Block 10:
            else {
                // Block 11:
                if (s1.charAt(i) != s2.charAt(i)) {
                    // Block 12:
                    System.out.println("No");
                    // Block 13:
                    System.exit(0);
                }
            }
        }
        // Block 14:
        System.out.println("Yes");
        // Block END.
    }
}
