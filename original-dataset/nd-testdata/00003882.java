class Main {
    public static void main(String[] args) {
        // Block 1:
        String[] input = "12 3 1".split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int z = Integer.parseInt(input[2]);
        System.out.println((x - z) / (y + z));
        // Block END.
    }
}
