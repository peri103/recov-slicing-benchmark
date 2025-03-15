class Main {
    public static void main(String[] args) {
        // Block 1:
        System.out.println(java.util.stream.IntStream.of("0 3".split(" "))
            .mapToInt(Integer::parseInt)
            .map(i -> i * (i - 1) / 2)
            .sum());
        // Block END.
    }
}
