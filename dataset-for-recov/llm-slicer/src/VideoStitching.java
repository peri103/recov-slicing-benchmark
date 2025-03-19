import java.util.*;
	class VideoStitching {
	    public int videoStitching(int[][] clips, int T) {
	        int[] dp = new int[T+1];
	        int I = Integer.MAX_VALUE / 2;
	        Arrays.fill(dp, I);
	        dp[0] = 0;
	        for(int i = 0;i < T;i++){
	        	for(int[] c : clips){
	        		if(c[0] == i){
	        			dp[Math.min(c[1], T)] = Math.min(
	        					dp[Math.min(c[1], T)],
	        					dp[i] + 1
	        					);
	        		}
	        	}
	        	for(int j = T-1;j >= 0;j--){
	        		dp[j] = Math.min(dp[j], dp[j+1]);
	        	}
	        }
	        return dp[T] < I ? dp[T] : -1;
	    }
		public static void main(String[] args) {
        VideoStitching videoStitching = new VideoStitching();
        
        int[][] clips = {
            {0, 2},
            {4, 6},
            {8, 10},
            {1, 9},
            {1, 5},
            {5, 9}
        };
        int T = 10;
        
        int result = videoStitching.videoStitching(clips, T);
        
        System.out.println("Minimum number of clips to cover the entire interval [0, " + T + "]: " + result);
    }
	}	
