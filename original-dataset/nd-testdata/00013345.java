class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "abcde,fghihgf,edcba";
        // Block 2:
        System.out.println(String.join(" ", s.split(",")));
        // Block END.
    }
}
