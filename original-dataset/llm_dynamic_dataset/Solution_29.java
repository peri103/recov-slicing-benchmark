/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
import java.util.*;

public class FindValueMostElement {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      this.val = x;
    }
  }

  public int[] findValueMostElement(TreeNode root) {
    if (root == null) return new int[0];
    List<Integer> level = new LinkedList<>();

    Queue<TreeNode> que = new LinkedList<>();
    que.add(root);

    while (!que.isEmpty()) {
      int currMax = que.peek().val;
      int size = que.size();

      while (size-- > 0) {
        TreeNode curr = que.remove();

        if (curr.left != null) que.add(curr.left);
        if (curr.right != null) que.add(curr.right);
        currMax = Math.max(currMax, curr.val);
      }

      level.add(currMax);
    }

    int[] maxLevel = new int[level.size()];
    int i = 0;
    for (int c : level) {
      maxLevel[i++] = c;
    }
    return maxLevel;
  }
  public static void main(String[] args) {
    FindValueMostElement solution = new FindValueMostElement();

    // Create a sample tree manually
    TreeNode root = solution.new TreeNode(1);
    root.left = solution.new TreeNode(3);
    root.right = solution.new TreeNode(2);
    root.left.left = solution.new TreeNode(5);
    root.left.right = solution.new TreeNode(3);
    root.right.right = solution.new TreeNode(9);

    int[] result = solution.findValueMostElement(root);
    System.out.println("The maximum value at each level is: " + Arrays.toString(result));
}
}
