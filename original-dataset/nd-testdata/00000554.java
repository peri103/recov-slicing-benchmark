class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "xyz";
        // Block 2:
        int k = 4;
        // Block 3:
        int n = s.length();
        // Block 4:
        StringBuilder ans = new StringBuilder();
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            if (s.charAt(i) == 'a') {
                // Block 7:
                ans.append("a");
            }
            // Block 8:
            else if (123 - s.charAt(i) <= k) {
                // Block 9:
                ans.append("a");
                // Block 10:
                k -= 123 - s.charAt(i);
            }
            // Block 11:
            else {
                // Block 12:
                ans.append(s.charAt(i));
            }
        }
        // Block 13:
        k %= 26;  
        // Block 14:
        char lastChar = ans.charAt(ans.length() - 1);
        ans.setCharAt(ans.length() - 1, (char) ((lastChar + k - 'a') % 26 + 'a'));
        // Block 15:
        System.out.println(ans.toString());
        // Block END.
    }
}
