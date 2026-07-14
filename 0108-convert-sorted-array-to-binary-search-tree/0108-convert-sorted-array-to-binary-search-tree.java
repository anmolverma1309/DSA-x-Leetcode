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
    public static TreeNode toBST(int arr[], int si, int ei){
        if( si> ei){
            return null;
        }
        int mid = (si +ei)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = toBST(arr, si, mid-1);
        root.right = toBST(arr, mid+1, ei);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int si = 0;
        int ei = nums.length-1;
        return toBST(nums, si, ei);
        
        
    }
}