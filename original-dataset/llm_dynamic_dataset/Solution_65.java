class MinEatingSpeed {
    public int minEatingSpeed(int[] piles, int H) {
        int min = 1;
        int max = 1000000000;
        while (min != max) {
            int m = (min+max)/2;
            int time = 0;
            for (int pile : piles) {
                time += pile/m;
                if (pile%m!=0)
                    time++;
            }
            if (time > H)
                min = m+1;
            else
                max = m;
        }
        return min;
    }
     public static void main(String[] args) {
        MinEatingSpeed minEatingSpeed = new MinEatingSpeed();
        
        int[] piles = {3, 6, 7, 11};
        int H = 8;
        
        int result = minEatingSpeed.minEatingSpeed(piles, H);
        
        System.out.println("Minimum eating speed: " + result);
    }
}