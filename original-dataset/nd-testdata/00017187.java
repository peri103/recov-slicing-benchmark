class Main {
    public static void main(String[] args) {
        // Block 1:
        System.out.println(new java.util.HashMap<String, String>() {{
            // Block 2:
            put("H H", "H");
            // Block 3:
            put("H D", "D");
            // Block 4:
            put("D H", "D");
            // Block 5:
            put("D D", "H");
        }}.get("D D"));
        // Block END.
    }
}
