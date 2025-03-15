class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "codefestival";
        // Block 2:
        int k = 100;
        // Block 3:
        int loop = 'z' + 1;
        // Block 4:
        int remaining = k;
        // Block 5:
        StringBuilder ans = new StringBuilder();
        // Block 6:
        for (char c : s.toCharArray()) {
            // Block 7:
            if (c == 'a') {
                // Block 8:
                ans.append(c);
                // Block 9:
                continue;
            }
            // Block 10:
            int r = loop - c;
            // Block 11:
            if (r <= remaining) {
                // Block 12:
                ans.append('a');
                // Block 13:
                remaining -= r;
            }
            // Block 14:
            else {
                // Block 15:
                ans.append(c);
            }
        }
        // Block 16:
        if (remaining > 0) {
            // Block 17:
            remaining %= 26;
            // Block 18:
            char lastChar = ans.charAt(ans.length() - 1);
            ans.setCharAt(ans.length() - 1, (char) (lastChar + remaining));
        }
        // Block 19:
        System.out.println(ans.toString());
        // Block END.
    }
}
