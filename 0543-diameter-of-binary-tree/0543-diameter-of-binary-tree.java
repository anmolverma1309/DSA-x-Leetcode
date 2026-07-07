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
class Solution {
    static class Info {
        int h;
        int d;

        public Info(int d, int h) {
            this.h = h;
            this.d = d;
        }
    }

    public Info dia (TreeNode root){
        if (root == null){
            return new Info(0,0);
        }

        Info leftinfo = dia(root.left);
        Info rightinfo = dia(root.right);

        int diam  = Math.max(leftinfo.h + rightinfo.h , Math.max(leftinfo.d, rightinfo.d));
        int h = 1+ Math.max( leftinfo.h , rightinfo.h);

        return new Info(diam,h);

        
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return dia(root).d;
    }
}