class Main {
    public static void main(String[] args) {
        // Block 1:
        String kai = "level";
        // Block 2:
        int num = kai.length();
        // Block 3:
        int ans = 0;
        // Block 4:
        int n1 = (num - 1) / 2;
        // Block 5:
        for (int i = 0; i < n1; i++) {
            // Block 6:
            if (kai.charAt(i) != kai.charAt(num - 1 - (i + 1))) {
                // Block 7:
                ans += 1;
            }
        }
        // Block 8:
        String l1 = kai.substring(0, n1);
        // Block 9:
        for (int i = 0; i < l1.length(); i++) {
            // Block 10:
            if (l1.charAt(i) != l1.charAt(l1.length() - 1 - (i + 1))) {
                // Block 11:
                ans += 1;
            }
        }
        // Block 12:
        String l2 = kai.substring(n1 + 1);
        // Block 13:
        for (int i = 0; i < l2.length(); i++) {
            // Block 14:
            if (l2.charAt(i) != l2.charAt(l2.length() - 1 - (i + 1))) {
                // Block 15:
                ans += 1;
            }
        }
        // Block 16:
        if (ans == 0) {
            // Block 17:
            System.out.println("Yes");
        // Block 18:
        } else {
            // Block 19:
            System.out.println("No");
        }
        // Block END.
    }
}
