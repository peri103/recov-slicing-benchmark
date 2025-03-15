class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 100, a = 100, b = 100;
        // Block 2:
        int max_sub = Math.min(a, b);
        // Block 3:
        int min_sub = max_sub - (n - Math.max(a, b));
        // Block 4:
        System.out.println(max_sub + " " + (min_sub > 0 ? min_sub : 0));
        // Block END.
    }
}
