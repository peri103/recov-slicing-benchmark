class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 750;
        // Block 2:
        String[] N = String.valueOf(n).split("");
        // Block 3:
        String ans = "";
        // Block 4:
        String res = N[0];
        // Block 5:
        boolean mn = true;
        // Block 6:
        boolean bl = true;
        // Block 7:
        for (String x : N) {
            // Block 8:
            if (Integer.parseInt(res) < Integer.parseInt(x)) {
                // Block 9:
                mn = false;
            }
            // Block 10:
            if (!x.equals(res)) {
                // Block 11:
                bl = false;
            }
        }
        // Block 12:
        if (bl) {
            // Block 13:
            System.out.println(n);
        }
        // Block 14:
        else {
            // Block 15:
            if (!mn) {
                // Block 16:
                for (int i = 0; i < N.length; i++) {
                    // Block 17:
                    ans += (Integer.parseInt(res) + 1);
                }
                // Block 18:
                System.out.println(ans);
            }
            // Block 19:
            else {
                // Block 20:
                for (int i = 0; i < N.length; i++) {
                    // Block 21:
                    ans += res;
                }
                // Block 22:
                System.out.println(ans);
            }
        }
        // Block END.
    }
}
