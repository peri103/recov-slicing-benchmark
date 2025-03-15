class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "SAT";
        // Block 2:
        java.util.HashMap<Integer, String> dict1 = new java.util.HashMap<>();
        dict1.put(7, "SUN");
        dict1.put(6, "MON");
        dict1.put(5, "TUE");
        dict1.put(4, "WED");
        dict1.put(3, "THU");
        dict1.put(2, "FRI");
        dict1.put(1, "SAT");
        // Block 3:
        java.util.List<Integer> keys = new java.util.ArrayList<>();
        for (java.util.Map.Entry<Integer, String> entry : dict1.entrySet()) {
            if (entry.getValue().equals(s)) {
                keys.add(entry.getKey());
            }
        }
        // Block 4:
        System.out.println(keys.get(0));
        // Block END.
    }
}
