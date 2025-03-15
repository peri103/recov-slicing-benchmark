class Main {
    public static void main(String[] args) {
        // Block 1:
        if (java.util.Arrays.equals(java.util.Arrays.stream("4 9 0 8".split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray(), new int[]{1, 4, 7, 9})) {
            // Block 2:
            System.out.println("YES");
        // Block 3:
        } else {
            // Block 4:
            System.out.println("NO");
        }
        // Block END.
    }
}
