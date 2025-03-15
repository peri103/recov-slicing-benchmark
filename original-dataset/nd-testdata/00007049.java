class Main {
    public static void main(String[] args) {
        // Block 1:
        String str = "210 5";
        // Block 2:
        String str2 = "31 41 59 26 53";
        // Block 3:
        String[] nums = str.split(" ");
        // Block 4:
        String[] nums2 = str2.split(" ");
        // Block 5:
        if (nums2.length != Integer.parseInt(nums[1])) {
            // Block 6:
            System.out.println("error");
        // Block 7:
        } else {
            // Block 8:
            int totalDamege = 0;
            // Block 9:
            for (String num : nums2) {
                // Block 10:
                totalDamege += Integer.parseInt(num);
            }
            // Block 11:
            if (Integer.parseInt(nums[0]) <= totalDamege) {
                // Block 12:
                System.out.println("Yes");
            // Block 13:
            } else {
                // Block 14:
                System.out.println("No");
            }
        }
        // Block END.
    }
}
