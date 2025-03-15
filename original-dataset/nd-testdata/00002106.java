class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 100, a = 100, b = 100;
        // Block 2:
        int ma = Math.min(a, b);
        // Block 3:
        int mi = Math.max(0, a + b - n);
        // Block 4:
        System.out.println(ma + " " + mi);
        // Block END.
    }
}
