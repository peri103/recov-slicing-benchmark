class Main {
    public static void main(String[] args) {
        // Block 1:
        java.util.Map<String, String> dic = new java.util.HashMap<>();
        dic.put("H,H", "H");
        dic.put("H,D", "D");
        dic.put("D,D", "H");
        dic.put("D,H", "D");
        // Block 2:
        String a = "D"; String b = "H";
        // Block 3:
        System.out.println(dic.get(a + "," + b));
        // Block END.
    }
}
