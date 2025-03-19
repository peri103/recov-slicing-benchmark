class ProbabilityOfHeads {
    public double probabilityOfHeads(double[] prob, int target) {
        int n = prob.length;
        double[][] p = new double[1+n][1+n];
        p[0][0] = 1;
        for(int i = 0; i< n; i++){
            for(int j = 0; j<= n; j++){
                p[i+1][j] += p[i][j]*(1-prob[i]);
                if(j < n)p[i+1][j+1] += p[i][j]*prob[i];
            }
        }
        return p[n][target];
    }
     public static void main(String[] args) {
        ProbabilityOfHeads probabilityOfHeads = new ProbabilityOfHeads();
        
        double[] prob = {0.5, 0.5, 0.5, 0.5};
        int target = 2;
        
        double result = probabilityOfHeads.probabilityOfHeads(prob, target);
        
        System.out.println("Probability of getting exactly " + target + " heads: " + result);
    }
}