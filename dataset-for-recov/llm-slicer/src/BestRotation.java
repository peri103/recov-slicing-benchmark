class BestRotation {
    public int bestRotation(int[] A) {
        int[] scoreIncrease = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            int v = A[i];
            if (i - v >= 0) {
                scoreIncrease[0]++;
                scoreIncrease[i - v + 1]--;
            }
            scoreIncrease[i + 1]++;
            if (i + A.length - v + 1 <= A.length) scoreIncrease[i + A.length - v + 1]--;
        }
        int maxScore = 0;
        int bestK = 0;
        int K = -1;
        int score = 0;
        while (K < A.length) {
            K++;
            score += scoreIncrease[K];
            if (score > maxScore) {
                maxScore = score;
                bestK = K;
            }
        }
        return bestK;
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 4, 0};
        BestRotation br = new BestRotation();
        int result = br.bestRotation(A);
        System.out.println("Best Rotation K: " + result);
    }

}