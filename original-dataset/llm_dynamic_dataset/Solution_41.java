class KthSmallestPath {
    int[][] cts = new int[16][16];
    
    public String kthSmallestPath(int[] dest, int k) {
        int nv = dest[0];
        int nh = dest[1];
        for (int i = 0; i <= 15; ++i) {
            cts[0][i]=1;
            cts[i][0]=1;
        }
        for (int i = 1; i <= 15; ++i) {
            for (int j = 1; j <= 15; ++j) {
                cts[i][j]=cts[i-1][j]+cts[i][j-1];
            }
        }
        return ksm(nh,nv,k);
    }
    
    public String ksm(int nh, int nv, int k) {
        if (nh==0&&nv==0)
            return "";
        if (nh==0)
            return "V"+ksm(nh,nv-1,k);
        if (nv==0)
            return "H"+ksm(nh-1,nv,k);
        if (k>cts[nh-1][nv])
            return "V"+ksm(nh,nv-1,k-cts[nh-1][nv]);
        return "H"+ksm(nh-1,nv,k);
    }
    public static void main(String[] args) {
        KthSmallestPath kthSmallestPath = new KthSmallestPath();
        int[] dest = {2, 3}; // Destination coordinates
        int k = 3; // k-th smallest path
        
        String result = kthSmallestPath.kthSmallestPath(dest, k);
        
        System.out.println("The " + k + "-th smallest path to destination " + 
                           "(" + dest[0] + ", " + dest[1] + ") is: " + result);
    }
}