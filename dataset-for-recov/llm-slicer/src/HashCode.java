import java.util.*;

public class HashCode {

	private static class Pair
	{
		public int value1 , value2;
		public Pair(int value1 , int value2)
		{
			this.value1 = value1;
			this.value2 = value2;
		}
		
		public int hashCode()
		{
			return this.value1 * 31 + this.value2;
		}
		
		public boolean equals(Object object)
		{
			Pair pair = (Pair) object;
			return (this.value1 == pair.value1) && (this.value2 == pair.value2);
		}
	}
	
	private List<List<Integer>> ans = new ArrayList<List<Integer>>();
	private Set<Pair> set = new HashSet<Pair>();
	
	public List<List<Integer>> findSubsequences(int[] nums) {
		
		dfs(nums , 0 , new ArrayList<Integer>());
		return ans;
        
    }
	
	private int hash1(List<Integer> list)
	{
		int value = 31;
		for (int temp : list)
			value = value * 37 + temp;
		return value;
	}
	
	private int hash2(List<Integer> list)
	{
		int value = 71;
		for (int temp : list)
			value = value * 73 + temp;
		return value;
	}
	
	private void dfs(int[] nums , int current , List<Integer> list)
	{
		if (current == nums.length)
		{
			if (list.size() > 1)
			{
				int hashValue1 = hash1(list);
				int hashValue2 = hash2(list);
				Pair pair = new Pair(hashValue1 , hashValue2);
				if (!set.contains(pair))
				{
					set.add(pair);
					List<Integer> newList = new ArrayList<Integer>(list);
					ans.add(newList);
				}
			}
		}
		else
		{	
			if (list.size() == 0 || (nums[current] >= list.get(list.size() - 1)))
			{
				list.add(nums[current]);
				dfs(nums , current + 1 , list);
				list.remove(list.size() - 1);
			}
			dfs(nums , current + 1 , list);
		}
	}
	 public static void main(String[] args) {
        HashCode hashCode = new HashCode();
        int[] nums = {4, 6, 7, 7};
        List<List<Integer>> result = hashCode.findSubsequences(nums);
        
        System.out.println("Subsequences:");
        for (List<Integer> subsequence : result) {
            System.out.println(subsequence);
        }
    }

}