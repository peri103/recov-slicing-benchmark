class Main {
    public static void main(String[] args) {
        // Block 1:
        int h = 210, n = 5;
        // Block 2:
        int[] a = {31, 41, 59, 26, 53};
        // Block 3:
        System.out.println((h - java.util.Arrays.stream(a).sum() <= 0) ? "Yes" : "No");
        // Block END.
    }
}
