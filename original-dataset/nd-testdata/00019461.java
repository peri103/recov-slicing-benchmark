class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 3;
        // Block 2:
        System.out.println(n % 2 == 1 ? new int[]{n, 2 * n}[0] : new int[]{n, 2 * n}[1]);
        // Block END.
    }
}
