class Main {
    public static void main(String[] args) {
        // Block 1:
        char[] S = {'x', 'y', 'z'};
        // Block 2:
        int k = 4;
        // Block 3:
        char[] Ans = new char[S.length];
        // Block 4:
        int c = 0;
        // Block 5:
        for (int i = 0; i < S.length; i++) {
            // Block 6:
            if ((26 - (S[i] - 'a')) % 26 <= k) {
                // Block 7:
                Ans[i] = 'a';
                // Block 8:
                k -= (26 - (S[i] - 'a')) % 26;
                // Block 9:
                c += (26 - (S[i] - 'a')) % 26;
            // Block 10:
            } else {
                // Block 11:
                Ans[i] = S[i];
            }
            // Block 12:
            if (i == S.length - 1) {
                // Block 13:
                c = Ans[i] + k % 26;
                // Block 14:
                if (Ans[i] + k % 26 >= 123) {
                    // Block 15:
                    c -= 26;
                }
                // Block 16:
                Ans[i] = (char) c;
            }
        }
        // Block 17:
        System.out.println(String.valueOf(Ans));
        // Block END.
    }
}
