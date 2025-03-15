/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;



class GetDirections {
     public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
    char[] res;
    
    public String getDirections(TreeNode root, int startValue, int destValue) {
        dfs(root, startValue, 0, new char[100005]);
        char[] s = res;
        dfs(root, destValue, 0, new char[100005]);
        char[] t = res;
        int ld = 0;
        for(int i = 0;i < s.length && i < t.length && s[i] == t[i];i++){
            ld = i+1;
        }
        StringBuilder ret = new StringBuilder();
        for(int i = ld;i < s.length;i++)ret.append('U');
        for(int i = ld;i < t.length;i++)ret.append(t[i]);
        return ret.toString();
    }
    
    void dfs(TreeNode cur, int tar, int dep, char[] s)
    {
        if(cur == null)return;
        if(cur.val == tar){
            res = Arrays.copyOf(s, dep);
            return;
        }
        
        s[dep] = 'L';
        dfs(cur.left, tar, dep+1, s);
        s[dep] = 'R';
        dfs(cur.right, tar, dep+1, s);
    }
     public static void main(String[] args) {
        // Create the binary tree as per the definition in the TreeNode class
        GetDirections.TreeNode root = new GetDirections.TreeNode(5);
        root.left = new GetDirections.TreeNode(3);
        root.right = new GetDirections.TreeNode(6);
        root.left.left = new GetDirections.TreeNode(2);
        root.left.right = new GetDirections.TreeNode(4);
        root.left.left.left = new GetDirections.TreeNode(1);

        // Create an instance of the GetDirections class
        GetDirections getDirections = new GetDirections();

        // Call the getDirections method
        int startValue = 3;
        int destValue = 1;
        String result = getDirections.getDirections(root, startValue, destValue);

        // Print the result
        System.out.println("Directions from " + startValue + " to " + destValue + ": " + result);
    }
}