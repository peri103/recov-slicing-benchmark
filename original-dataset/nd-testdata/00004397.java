class Main {
    public static void main(String[] args) {
        // Block 1:
        int H1 = 10, M1 = 0, H2 = 15, M2 = 0, K = 30;
        // Block 2:
        int x = H1 * 60 + M1;
        // Block 3:
        int y = H2 * 60 + M2;
        // Block 4:
        System.out.println(y - x - K);
        // Block END.
    }
}
