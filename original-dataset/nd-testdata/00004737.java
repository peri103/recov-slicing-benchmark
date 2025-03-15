class Main {
    public static void main(String[] args) {
        // Block 1:
        String charStr = "xyz";
        // Block 2:
        int length = charStr.length();
        // Block 3:
        System.out.println(String.format("%s%d%s", charStr.charAt(0), length - 2, charStr.charAt(length - 1)));
        // Block END.
    }
}
