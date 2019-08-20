package algorithms.tree;

/**
 * @author: shuo
 * @date: 2019/08/20
 */
public class ValidateBinarySearchTree {
    long val = Long.MIN_VALUE ;

    public boolean isValidBST(TreeNode root) {
        return checkValid(root);
    }

    public boolean checkValid(TreeNode treeNode) {
        if (treeNode == null) {
            return true;
        }
        System.out.println(treeNode.val);
        boolean v1 = checkValid(treeNode.left);
        if(treeNode.val <= val)
        {
            return false;
        }
        val = treeNode.val;
        boolean v2 = checkValid(treeNode.right);
        return v1 && v2;
    }
}
