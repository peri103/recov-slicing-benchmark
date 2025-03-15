class Main {
    public static void main(String[] args) {
        // Block 1:
        System.out.println("YNEOS"[isSorted(new int[]{1, 9, 7, 4}) ? 0 : 1]);
        // Block END.
    }

    private static boolean isSorted(int[] arr) {
        int[] sortedArr = arr.clone();
        java.util.Arrays.sort(sortedArr);
        return java.util.Arrays.equals(sortedArr, new int[]{1, 4, 7, 9});
    }
}
