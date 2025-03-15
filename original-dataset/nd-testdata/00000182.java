class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "a";
        // Block 2:
        int k = 25;
        // Block 3:
        String ans = "";
        // Block 4:
        for (int j = 0; j < s.length() - 1; j++) {
            char i = s.charAt(j);
            // Block 5:
            if (i == 'a') {
                // Block 6:
                ans += i;
                // Block 7:
                continue;
            }
            // Block 8:
            if (k >= 123 - (int) i) {
                // Block 9:
                k -= 123 - (int) i;
                // Block 10:
                ans += 'a';
            }
            // Block 11:
            else {
                // Block 12:
                ans += i;
            }
        }
        // Block 13:
        char i = s.charAt(s.length() - 1);
        // Block 14:
        ans += (char) (((int) i + k - 97) % 26 + 97);
        // Block 15:
        System.out.println(ans);
        // Block END.
    }
}
