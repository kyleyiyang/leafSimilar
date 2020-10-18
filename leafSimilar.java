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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> L1 = new ArrayList<>();
        List<Integer> L2 = new ArrayList<>();
        leaves(root1,L1);
        leaves(root2,L2);
        if (L1.size()!=L2.size()) {
            return false;
        }
        for (int i=0; i<L1.size(); i++) {
            if (L1.get(i) != L2.get(i)) {
                return false;
            }
        }
        return true;
    }
    public static void leaves(TreeNode root, List<Integer> L) {
        if (root!=null && root.left==null && root.right==null) {
            L.add(root.val);
        }
        if (root.left!=null) {
            leaves(root.left, L);
        }
        if (root.right!=null) {
            leaves(root.right, L);
        }
    }
}
