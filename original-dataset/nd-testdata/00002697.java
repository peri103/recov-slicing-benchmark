class Main {
    public static void main(String[] args) {
        // Block 1:
        java.util.Set<Integer> s = new java.util.HashSet<>();
        s.add(1);
        s.add(4);
        s.add(9);
        s.add(7);
        // Block 2:
        if (s.equals(new java.util.HashSet<>(java.util.Arrays.asList(1, 7, 9, 4)))) {
            // Block 3:
            System.out.println("YES");
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println("NO");
        }
        // Block END.
    }
}
