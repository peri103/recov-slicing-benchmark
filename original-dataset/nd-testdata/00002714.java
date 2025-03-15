class Main {
    public static void main(String[] args) {
        // Block 1:
        System.out.println("YNEOS"[isSorted(new int[]{1, 2, 9, 1}) ? 0 : 1]);
        // Block END.
    }

    private static boolean isSorted(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        return Arrays.equals(sortedArr, new int[]{1, 4, 7, 9});
    }
}
