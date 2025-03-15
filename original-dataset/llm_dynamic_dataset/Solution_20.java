
 
class DeepestLeavesSum {
    public static class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
    }
    int[] c = new int[10001];
    int max = 0;
    
    public int deepestLeavesSum(TreeNode root) {
        dls(root, 0);
        return c[max];
    }
    
    public void dls(TreeNode root, int d) {
        if (root==null)
            return;
        if (root.left==null&&root.right==null) {
            c[d] += root.val;
        }
        max = Math.max(max,d);
        dls(root.left,d+1);
        dls(root.right,d+1);
    }
      public static void main(String[] args) {
        DeepestLeavesSum.TreeNode root = new DeepestLeavesSum.TreeNode(1);
        root.left = new DeepestLeavesSum.TreeNode(2);
        root.right = new DeepestLeavesSum.TreeNode(3);
        root.left.left = new DeepestLeavesSum.TreeNode(4);
        root.left.right = new DeepestLeavesSum.TreeNode(5);
        root.right.right = new DeepestLeavesSum.TreeNode(6);
        root.left.left.left = new DeepestLeavesSum.TreeNode(7);
        root.right.right.right = new DeepestLeavesSum.TreeNode(8);

        DeepestLeavesSum deepestLeavesSum = new DeepestLeavesSum();
        int result = deepestLeavesSum.deepestLeavesSum(root);
        System.out.println("Deepest Leaves Sum: " + result);
    }
}