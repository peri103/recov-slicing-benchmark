class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 5;
        // Block 2:
        if (N % 2 == 1) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int ret = 0;
            // Block 6:
            for (int i = 1; i <= 26; i++) {
                // Block 7:
                ret += N / (2 * Math.pow(5, i));
            }
            // Block 8:
            System.out.println(ret);
        }
        // Block END.
    }
}
