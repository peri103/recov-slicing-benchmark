	import java.util.*;
	class FreqStack {
		Map<Integer, Integer> map = new HashMap<>(); // heap-id
		Map<Integer, Deque<Integer>> dqs = new HashMap<>();
		MinHeapL h = new MinHeapL(10010);
		int[] imap = new int[10010];
		int gen = 0;
		int time = 0;
		long O = 1000000000;
		
	    public FreqStack() {
	        
	    }
	    
	    public void push(int x) {
	        if(!map.containsKey(x)){
	        	imap[gen] = x;
	        	map.put(x, gen++);
	        	dqs.put(x, new ArrayDeque<>());
	        }
	        h.update(map.get(x), O-dqs.get(x).size()-1<<32|O-time);
	        dqs.get(x).addLast(time++);
	    }
	    
	    public int pop() {
	        int argmin = h.argmin();
	        h.remove(argmin);
	        int x = imap[argmin];
	        dqs.get(x).pollLast();
	        if(!dqs.get(x).isEmpty()){
	        	h.update(map.get(x), O-dqs.get(x).size()<<32|O-dqs.get(x).peekLast());
	        }
	        return x;
	    }
	    
	    class MinHeapL {
	    	public long[] a;
	    	public int[] map;
	    	public int[] imap;
	    	public int n;
	    	public int pos;
	    	public long INF = Long.MAX_VALUE;
	    	
	    	public MinHeapL(int m)
	    	{
	    		n = Integer.highestOneBit((m+1)<<1);
	    		a = new long[n];
	    		map = new int[n];
	    		imap = new int[n];
	    		Arrays.fill(a, INF);
	    		Arrays.fill(map, -1);
	    		Arrays.fill(imap, -1);
	    		pos = 1;
	    	}
	    	
	    	public long add(int ind, long x)
	    	{
	    		int ret = imap[ind];
	    		if(imap[ind] < 0){
	    			a[pos] = x; map[pos] = ind; imap[ind] = pos;
	    			pos++;
	    			up(pos-1);
	    		}
	    		return ret != -1 ? a[ret] : x;
	    	}
	    	
	    	public long update(int ind, long x)
	    	{
	    		int ret = imap[ind];
	    		if(imap[ind] < 0){
	    			a[pos] = x; map[pos] = ind; imap[ind] = pos;
	    			pos++;
	    			up(pos-1);
	    		}else{
	    			a[ret] = x;
	    			up(ret);
	    			down(ret);
	    		}
	    		return x;
	    	}
	    	
	    	public long remove(int ind)
	    	{
	    		if(pos == 1)return INF;
	    		if(imap[ind] == -1)return INF;
	    		
	    		pos--;
	    		int rem = imap[ind];
	    		long ret = a[rem];
	    		map[rem] = map[pos];
	    		imap[map[pos]] = rem;
	    		imap[ind] = -1;
	    		a[rem] = a[pos];
	    		a[pos] = INF;
	    		map[pos] = -1;
	    		
	    		up(rem);
	    		down(rem);
	    		return ret;
	    	}
	    	
	    	public long min() { return a[1]; }
	    	public int argmin() { return map[1]; }
	    	public int size() {	return pos-1; }
	    	
	    	private void up(int cur)
	    	{
	    		for(int c = cur, p = c>>>1;p >= 1 && a[p] > a[c];c>>>=1, p>>>=1){
	    			long d = a[p]; a[p] = a[c]; a[c] = d;
	    			int e = imap[map[p]]; imap[map[p]] = imap[map[c]]; imap[map[c]] = e;
	    			e = map[p]; map[p] = map[c]; map[c] = e;
	    		}
	    	}
	    	
	    	private void down(int cur)
	    	{
	    		for(int c = cur;2*c < pos;){
	    			int b = a[2*c] < a[2*c+1] ? 2*c : 2*c+1;
	    			if(a[b] < a[c]){
	    				long d = a[c]; a[c] = a[b]; a[b] = d;
	    				int e = imap[map[c]]; imap[map[c]] = imap[map[b]]; imap[map[b]] = e;
	    				e = map[c]; map[c] = map[b]; map[b] = e;
	    				c = b;
	    			}else{
	    				break;
	    			}
	    		}
	    	}
	    }
		  public static void main(String[] args) {
        FreqStack freqStack = new FreqStack();
        
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);
        
        System.out.println(freqStack.pop()); // should return 5
        System.out.println(freqStack.pop()); // should return 7
        System.out.println(freqStack.pop()); // should return 5
        System.out.println(freqStack.pop()); // should return 4
    }
	}
