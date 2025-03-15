class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 3, p = 0;
        // Block 2:
        int even_count = 0;
        // Block 3:
        int odd_count = n - even_count;
        // Block 4:
        if (odd_count == 0) {
            // Block 5:
            System.out.println(p == 1 ? 0 : (int) Math.pow(2, even_count));
        // Block 6:
        } else {
            // Block 7:
            System.out.println((int) Math.pow(2, even_count) * (int) Math.pow(2, odd_count - 1));
        }
        // Block END.
    }
}
