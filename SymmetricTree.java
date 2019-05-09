package algorithms;

/*
给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3
 */
public class SymmetricTree {

    public boolean key = true;
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
        {
            return key;
        }
        tree(root.left, root.right);
        return key;
    }


    public void tree(TreeNode treeNode, TreeNode treeNode2)
    {
        if(treeNode == null && treeNode2 == null)
        {
            return;
        }
        if( treeNode == null || treeNode2 == null || treeNode.val != treeNode2.val)
        {
            key = false;
            return ;
        }
        tree(treeNode.left, treeNode2.right);
        tree(treeNode.right, treeNode2.left);
    }
}

 class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }