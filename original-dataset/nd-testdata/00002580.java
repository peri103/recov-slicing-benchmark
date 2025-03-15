class Main {
    public static void main(String[] args) {
        // Block 1:
        java.util.Set<Integer> n = new java.util.HashSet<>();
        n.add(1);
        n.add(4);
        n.add(9);
        n.add(7);
        // Block 2:
        System.out.println((len(new java.util.HashSet<>(java.util.Arrays.asList(1, 9, 7, 4))).equals(n.size()) ? "YES" : "NO"));
        // Block END.
    }
}
