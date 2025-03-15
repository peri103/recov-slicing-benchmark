import java.util.*;


  
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 class FlipMatchVoyage {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

   Set<TreeNode> flipped = new HashSet<>();
    Map<TreeNode, TreeNode> parent = new HashMap<>();
    int index = 0;
    List<Integer> ans;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        flipped = new HashSet<>();
        parent = new HashMap<>();
        index = 0;
        ans = new ArrayList<>();

        List<Integer> allValues = new ArrayList<>();
        visitAll(root, allValues);
        if (allValues.size() != voyage.length) {
            ans.add(-1);
            return ans;
        }

        genParent(root);

        for (int i = 0; i < voyage.length; i++) {
            index = 0;
            int ret = dfs(root, voyage);
            if (ret == 0) return ans;
            else if (ret == -1) {
                ans = new ArrayList<>();
                ans.add(-1);
                return ans;
            }
        }

        return ans;
    }

    private void visitAll(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        visitAll(root.left, list);
        visitAll(root.right, list);
    }

    private void genParent(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            parent.put(root.left, root);
        }

        if (root.right != null) {
            parent.put(root.right, root);
        }

        genParent(root.left);
        genParent(root.right);
    }

    private int dfs(TreeNode root, int[] voyage) {
        if (root == null) return 0;

        if (root.val != voyage[index]) {
            TreeNode p = parent.get(root);
            if (p == null || flipped.contains(p)) {
                ans = new ArrayList<>();
                ans.add(-1);
                return -1;
            } else {
                ans.add(p.val);
                flipped.add(p);
                TreeNode t = p.left;
                p.left = p.right;
                p.right = t;
            }
            return 1;
        } else {
            if (root.left != null) {
                index++;
                int ret = dfs(root.left, voyage);
                if (ret != 0) return ret;
            }

            if (root.right != null) {
                index++;
                int ret = dfs(root.right, voyage);
                if (ret != 0) return ret;
            }

            return 0;
        }
    }


     public static void main(String[] args) {
        FlipMatchVoyage solution = new FlipMatchVoyage();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int[] voyage = {1, 3, 2};
        List<Integer> result = solution.flipMatchVoyage(root, voyage);
        System.out.println("Result: " + result);
    }


}