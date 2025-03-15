import java.util.*;

/**
 * Definition for a binary tree node.
 *  */
 public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
     TreeNode(int x) { this.val = x; }
        public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        // Initialize CBTInserter with the sample tree
        CBTInserter obj = new CBTInserter(root);

        // Insert new nodes and print the parent's value
        System.out.println("Parent node after inserting 7: " + obj.insert(7));  // Should insert 7 as the right child of node 3
        System.out.println("Parent node after inserting 8: " + obj.insert(8));  // Should insert 8 as the left child of node 4

        // Get the root of the tree and print its structure
        TreeNode updatedRoot = obj.get_root();
        printTree(updatedRoot);
    }

    // Helper method to print the tree structure
    public static void printTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        System.out.println();
    }
  }



class CBTInserter {
    TreeNode root;
    int cnt;
    private int calc(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return calc(root.left) + calc(root.right) + 1;
    }
    public CBTInserter(TreeNode root) {
        this.root = root;
        cnt = calc(root);
    }
    
    public int insert(int v) {
        int cur = ++cnt;
        int ipos = 31;
        while ((cur & (1 << ipos)) == 0) {
            ipos--;
        }
        ipos--;
        TreeNode curNode = root;
        while (ipos > 0) {
            if ((cur & (1 << ipos)) == 0) {
                curNode = curNode.left;
            } else {
                curNode = curNode.right;
            }
            ipos--;
        }
        if ((cur & (1 << ipos)) == 0) {
            curNode.left = new TreeNode(v);
        } else {
            curNode.right = new TreeNode(v);
        }
        return curNode.val;
    }
    
    public TreeNode get_root() {
        return root;
    }
   
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */