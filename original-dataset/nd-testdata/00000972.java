class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 112;
        // Block 2:
        while (String.valueOf(n).chars().distinct().count() != 1) {
            // Block 3:
            n += 1;
        }
        // Block 4:
        System.out.println(n);
        // Block END.
    }
}
