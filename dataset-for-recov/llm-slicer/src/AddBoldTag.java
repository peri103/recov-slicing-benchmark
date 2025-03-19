	public class AddBoldTag {
	    public String addBoldTag(String s, String[] dict) {
	        int n = s.length();
	        char[] ss = s.toCharArray();
	        int[] imos = new int[n+1];
	        for(String d : dict){
	        	char[] q = d.toCharArray();
	        	int[] kmp = kmpTable(q);
	    		int p = 0;
	    		for(int i = 0;i < ss.length;i++){
	    			while(p >= 0 && q[p] != ss[i])p = kmp[p];
	    			if(++p == q.length){
	    				imos[i-q.length+1]++;
	    				imos[i+1]--;
	    				p = kmp[p];
	    			}
	    		}
	        }
	        for(int i = 0;i < n;i++)imos[i+1] += imos[i];
	        StringBuilder sb = new StringBuilder();
	        StringBuilder temp = new StringBuilder();
	        for(int i = 0;i < n;i++){
	        	if(imos[i] > 0){
	        		temp.append(ss[i]);
	        	}else{
	        		if(temp.length() > 0){
		        		sb.append("<b>");
		        		sb.append(temp);
		        		sb.append("</b>");
		        		temp = new StringBuilder();
	        		}
	        		sb.append(ss[i]);
	        	}
	        }
    		if(temp.length() > 0){
        		sb.append("<b>");
        		sb.append(temp);
        		sb.append("</b>");
    		}
    		return sb.toString();
	    }
	    
		public int[] kmpTable(char[] str)
		{
			int n = str.length;
			int[] kmp = new int[n+1];
			kmp[0] = -1; kmp[1] = 0;
			for(int i = 2, j = 0;i <= n;i++){
				while(j > 0 && str[i-1] != str[j])j = kmp[j];
				kmp[i] = str[i-1] == str[j] ? ++j : 0;
			}
			return kmp;
		}
      public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        String[] dict = {"quick", "fox", "lazy"};

        AddBoldTag instance = new AddBoldTag();
        String result = instance.addBoldTag(input, dict);

        System.out.println(result);
    }
	}	
