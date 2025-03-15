class Main {
    public static void main(String[] args) {
        // Block 1:
        System.out.println(java.util.Arrays.equals(java.util.Arrays.stream("1 9 7 4".split(" "))
            .mapToInt(Integer::parseInt)
            .sorted()
            .toArray(), new int[]{1, 4, 7, 9}) ? "YES" : "NO");
        // Block END.
    }
}
