class Main {
    public static void main(String[] args) {
        // Block 1:
        String[] parts = "64146 123 456".split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        int z = Integer.parseInt(parts[2]);
        System.out.println((x - z) / (y + z));
        // Block END.
    }
}
