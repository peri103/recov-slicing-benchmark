class Main {
    public static void main(String[] args) {
        // Block 1:
        char[] S = {'x', 'y', 'z'};
        // Block 2:
        int N = S.length;
        // Block 3:
        int K = 4;
        // Block 4:
        for (int i = 0; i < N - 1; i++) {
            // Block 5:
            int d = ('a' - S[i]) % 26;
            // Block 6:
            if (d <= K) {
                // Block 7:
                S[i] = 'a';
                // Block 8:
                K -= d;
            }
        }
        // Block 9:
        S[S.length - 1] = (char) ((S[S.length - 1] - 'a' + K) % 26 + 'a');
        // Block 10:
        System.out.println(String.valueOf(S));
        // Block END.
    }
}
