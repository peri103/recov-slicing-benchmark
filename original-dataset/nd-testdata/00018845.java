class Main {
    public static void main(String[] args) {
        // Block 1:
        int h = 14;
        // Block 2:
        int w = 12;
        // Block 3:
        int n = 112;
        // Block 4:
        int r = Math.max(h, w);
        // Block 5:
        if (n % r != 0) {
            // Block 6:
            System.out.println(n / r + 1);
        // Block 7:
        } else {
            // Block 8:
            System.out.println(n / r);
        }
        // Block END.
    }
}
