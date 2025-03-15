import java.util.*;




class ReplaceValueInTree {
	public static class TreeNode {
	int val;
    TreeNode left;
  	TreeNode right;
    TreeNode(int x) { val = x; }
 }

	public TreeNode replaceValueInTree(TreeNode root) {
		HashMap<TreeNode, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		replaceValueInTree(root, null, 0, map, map2);
		replaceValueInTree(root, 0, null, map, map2);
		return root;
	}

	private void replaceValueInTree(TreeNode root, TreeNode parent, int depth, HashMap<TreeNode, Integer> map,
			HashMap<Integer, Integer> map2) {
		if (root != null) {
			if (parent != null) {
				map.put(parent, map.getOrDefault(parent, 0) + root.val);
			}
			map2.put(depth, map2.getOrDefault(depth, 0) + root.val);
			replaceValueInTree(root.left, root, depth + 1, map, map2);
			replaceValueInTree(root.right, root, depth + 1, map, map2);
		}
	}

	private void replaceValueInTree(TreeNode root, int depth, TreeNode parent, HashMap<TreeNode, Integer> map,
			HashMap<Integer, Integer> map2) {
		if (root != null) {
			root.val = parent == null ? 0 : map2.get(depth) - map.get(parent);
			replaceValueInTree(root.left, depth + 1, root, map, map2);
			replaceValueInTree(root.right, depth + 1, root, map, map2);
		}
	}
	    public static void main(String[] args) {

        ReplaceValueInTree.TreeNode root = new ReplaceValueInTree.TreeNode(1);
        root.left = new ReplaceValueInTree.TreeNode(2);
        root.right = new ReplaceValueInTree.TreeNode(3);
        root.left.left = new ReplaceValueInTree.TreeNode(4);
        root.left.right = new ReplaceValueInTree.TreeNode(5);
        root.right.right = new ReplaceValueInTree.TreeNode(6);

        ReplaceValueInTree replaceValueInTree = new ReplaceValueInTree();
        ReplaceValueInTree.TreeNode newRoot = replaceValueInTree.replaceValueInTree(root);


    }

}