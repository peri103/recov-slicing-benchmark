class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "a";
        // Block 2:
        int k = 25;
        // Block 3:
        int n = s.length();
        // Block 4:
        int[] a = new int[n];
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            a[i] = s.charAt(i) - 'a';
        }
        // Block 7:
        for (int i = 0; i < n; i++) {
            // Block 8:
            int need = (26 - a[i]) % 26;
            // Block 9:
            if (k >= need) {
                // Block 10:
                a[i] = 0;
                // Block 11:
                k -= need;
            }
        }
        // Block 12:
        k %= 26;
        // Block 13:
        for (int ii = 0; ii < n; ii++) {
            // Block 14:
            int i = n - 1 - ii;
            // Block 15:
            int rem = 25 - a[i];
            // Block 16:
            if (rem <= k) {
                // Block 17:
                a[i] += rem;
                // Block 18:
                k -= rem;
            }
            // Block 19:
            else {
                // Block 20:
                a[i] += k;
                // Block 21:
                k = 0;
                // Block 22:
                break;
            }
        }
        // Block 23:
        char[] ans = new char[n];
        // Block 24:
        for (int i = 0; i < n; i++) {        
            // Block 25:
            ans[i] = (char) (a[i] + 'a');
        }
        // Block 26:
        System.out.println(String.valueOf(ans));
        // Block END.
    }
}
