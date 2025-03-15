class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "2017/01/31";
        // Block 2:
        System.out.println(String.format("2018/%s", s.substring(5)));
        // Block END.
    }
}
