/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 
class LongestZigZag {
	 public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
	 }
	int res = 0;
	public int longestZigZag(TreeNode root) {
		res = 0;
		solve(root);
		return res - 1;
	}

	private int[] solve(TreeNode cur) {
		if (cur == null) return new int[] {0, 0};
		int[] left = solve(cur.left);
		int[] right = solve(cur.right);
		int[] ans = new int[] {left[1] + 1, right[0] + 1};
		this.res = Math.max(this.res, ans[0]);
		this.res = Math.max(this.res, ans[1]);
		return ans;
	}
	public static void main(String[] args) {
        LongestZigZag longestZigZag = new LongestZigZag();
        
        LongestZigZag.TreeNode root = new LongestZigZag.TreeNode(1);
        root.left = new LongestZigZag.TreeNode(2);
        root.right = new LongestZigZag.TreeNode(3);
        root.left.right = new LongestZigZag.TreeNode(4);
        root.left.right.right = new LongestZigZag.TreeNode(5);
        root.left.right.right.left = new LongestZigZag.TreeNode(6);

        int result = longestZigZag.longestZigZag(root);

        System.out.println("Length of the longest ZigZag path: " + result);
    }
}
