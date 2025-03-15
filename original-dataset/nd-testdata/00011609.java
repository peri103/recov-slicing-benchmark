class Main {
    public static void main(String[] args) {
        // Block 1:
        String[] li = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 2:
        String S = "SUN";
        // Block 3:
        int rest = 7 - java.util.Arrays.asList(li).indexOf(S);
        // Block 4:
        System.out.println(rest);
        // Block END.
    }
}
