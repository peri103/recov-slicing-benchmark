class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "2017/01/31";
        // Block 2:
        int a = Integer.parseInt(s.substring(0, 4));
        // Block 3:
        System.out.println((a + 1) + s.substring(4));
        // Block END.
    }
}
