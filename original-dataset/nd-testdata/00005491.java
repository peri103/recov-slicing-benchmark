class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 5;
        // Block 2:
        if ((N & 0b1) != 0) {
            // Block 3:
            int ans = N / 2 + 1;
            // Block 4:
            System.out.println(ans);
        } else {
            // Block 5:
            int ans = N / 2;
            // Block 6:
            System.out.println(ans);
        }
        // Block END.
    }
}
