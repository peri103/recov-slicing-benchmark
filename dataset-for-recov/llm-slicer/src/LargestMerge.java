class LargestMerge {
    public String largestMerge(String word1, String word2) {
        char[] s = word1.toCharArray();
        char[] t = word2.toCharArray();
        int n = s.length, m = t.length;
        char[] ret = new char[n+m];
        int i = 0, j = 0, p = 0;
        for(;i < n  && j < m;){
            int k, l;
            for(k = i, l = j;k < n && l < m && s[k] == t[l];k++,l++);
            if(k >= n){
                ret[p++] = t[j++];
            }else if(l >= m){
                ret[p++] = s[i++];
            }else if(s[k] > t[l]){
                ret[p++] = s[i++];
            }else{
                ret[p++] = t[j++];
            }
        }
        while(i < n)ret[p++] = s[i++];
        while(j < m)ret[p++] = t[j++];
        return new String(ret);
    }
    public static void main(String[] args) {
        LargestMerge largestMerge = new LargestMerge();
        String word1 = "abcabc";
        String word2 = "abdcaba";
        
        String result = largestMerge.largestMerge(word1, word2);
        
        System.out.println("The largest merge is: " + result);
    }
}