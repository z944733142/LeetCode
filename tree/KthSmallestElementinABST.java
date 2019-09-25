package algorithms.tree;

import sun.reflect.generics.tree.Tree;

/**
 * @author: shuo
 * @date: 2019/09/06
 */
public class KthSmallestElementinABST {
    int val;
    int num;
    public int kthSmallest(TreeNode root, int k) {
            num = k;
            func(root);
            return val;
    }

    public void func(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        func(node.left);
        num--;
        if(num == 0)
        {
            val = node.val;
        }
        func(node.right);
    }
}
