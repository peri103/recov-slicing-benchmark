class Main {
    public static void main(String[] args) {
        // Block 1:
        String a = "a";
        // Block 2:
        int n = a.length();
        // Block 3:
        int m = 25;
        // Block 4:
        String ans = "";
        // Block 5:
        for (int i = 0; i < n - 1; i++) {
            // Block 6:
            if (a.charAt(i) == 'a') {
                // Block 7:
                ans += "a";
                // Block 8:
                continue;
            }
            // Block 9:
            int x = a.charAt(i) - 'a';
            // Block 10:
            if (m >= 26 - x) {
                // Block 11:
                ans += "a";
                // Block 12:
                m -= 26 - x;
            }
            // Block 13:
            else {
                // Block 14:
                ans += a.charAt(i);
            }
        }
        // Block 15:
        ans += (char) ((a.charAt(n - 1) - 'a' + m) % 26 + 'a');
        // Block 16:
        System.out.println(ans);
        // Block END.
    }
}
