class Main {
    public static void main(String[] args) {
        // Block 1:
        int a = 1, b = 9, c = 7, d = 4;
        // Block 2:
        java.util.Set<Integer> S = new java.util.HashSet<>();
        S.add(a);
        S.add(b);
        S.add(c);
        S.add(d);
        // Block 3:
        if (S.equals(java.util.Set.of(1, 7, 9, 4))) {
            // Block 4:
            System.out.println("YES");
        // Block 5:
        } else {
            // Block 6:
            System.out.println("NO");
        }
        // Block END.
    }
}
