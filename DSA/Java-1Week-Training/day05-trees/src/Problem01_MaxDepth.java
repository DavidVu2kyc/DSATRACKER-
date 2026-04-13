public class Problem01_MaxDepth {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    /*
     * Hint:
     * Use recursion.
     * Depth of a node is:
     * 1 + max(depth of left subtree, depth of right subtree)
     *
     * Pseudocode:
     * if root is null:
     *     return 0
     * leftDepth = solve left child
     * rightDepth = solve right child
     * return 1 + larger of leftDepth and rightDepth
     */
}
