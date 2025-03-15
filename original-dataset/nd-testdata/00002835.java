class Main {
    public static void main(String[] args) {
        // Block 1:
        String S = "1111111111";
        // Block 2:
        int ans = 99999;
        // Block 3:
        int ans_s = 99999;
        // Block 4:
        for (int i = 0; i < S.length() - 2; i++) {
            // Block 5:
            int s = Integer.parseInt(S.substring(i, i + 3));
            // Block 6:
            ans = Math.min(ans, Math.abs(s - 753));
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
}
