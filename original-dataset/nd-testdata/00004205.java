class Main {
    public static void main(String[] args) {
        // Block 1:
        int H1 = 10, M1 = 0, H2 = 12, M2 = 0, K = 120;
        // Block 2:
        int timeW = M1 + H1 * 60;
        // Block 3:
        int timeS = M2 + H2 * 60;
        // Block 4:
        System.out.println(timeS - timeW - K);
        // Block END.
    }
}
