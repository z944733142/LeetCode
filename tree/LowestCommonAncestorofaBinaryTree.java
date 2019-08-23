package algorithms.tree;

/**
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 *示例 1:
 *
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
 *
 * @author: shuo
 * @date: 2019/08/23
 */
public class LowestCommonAncestorofaBinaryTree {
    TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
        {
            return null;
        }
        TreeNode t1, t2;
        t1 = lowestCommonAncestor(root.left, p, q);
        t2 = lowestCommonAncestor(root.right, p, q);
        if(t1 != null && t2 != null && res == null)
        {
            return root;
        }
        if(root == p || root == q)
        {
            return root;
        }
        if(t1 != null)
        {
            return t1;
        }
        if(t2 != null)
        {
            return t2;
        }
        return null;
    }
}
