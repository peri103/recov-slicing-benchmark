class Main {
    public static void main(String[] args) {
        // Block 1:
        int a = 111;
        // Block 2:
        while (String.valueOf(a).chars().distinct().count() != 1) {
            // Block 3:
            a += 1;
        }
        // Block 4:
        System.out.println(a);
        // Block END.
    }
}
