class Main {
    public static void main(String[] args) {
        // Block 1:
        String[] input = "12 3 1".split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        System.out.println((a - c) / (b + c));
        // Block END.
    }
}
