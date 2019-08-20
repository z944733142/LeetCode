package algorithms.tree;

/**
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
