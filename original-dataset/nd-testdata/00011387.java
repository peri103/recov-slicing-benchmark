class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "SUN";
        // Block 2:
        String[] apple = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        // Block 3:
        System.out.println(7 - java.util.Arrays.asList(apple).indexOf(s));
        // Block END.
    }
}
