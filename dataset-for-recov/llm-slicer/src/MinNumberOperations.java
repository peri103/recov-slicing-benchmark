class MinNumberOperations {
    public int minNumberOperations(int[] target) {
        int free = 0;
        int req = 0;
        for (int i = 0; i < target.length; i++) {
            if (target[i] > free) {
                req += target[i] - free;
                free = target[i];
            } else if (target[i] < free) {
                free = target[i];
            }
        }
        return req;
    }
        public static void main(String[] args) {
        MinNumberOperations minNumberOperations = new MinNumberOperations();
        
        int[] target = {3, 1, 5, 4, 2};
        
        int result = minNumberOperations.minNumberOperations(target);
        
        System.out.println("Minimum number of operations: " + result);
    }
}