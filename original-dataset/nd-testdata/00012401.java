class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "level";
        System.out.println(new String[]{"No", "Yes"}[s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2 + 1)) ? 1 : 0]);
        // Block END.
    }
}
