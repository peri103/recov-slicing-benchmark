class Main {
    public static void main(String[] args) {
        // Block 1:
        int v = 20, n = 3;
        // Block 2:
        int[] arr = {4, 5, 6};
        // Block 3:
        int sum = 0;
        for (int i = arr.length - n; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum >= v ? "Yes" : "No");
        // Block END.
    }
}
