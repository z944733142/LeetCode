package algorithms.tree;

import java.util.HashMap;

/**
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 递归
 * @author: shuo
 * @date: 2019/08/07
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public static void main(String[] args) {
        ConstructBinaryTreefromPreorderandInorderTraversal c = new ConstructBinaryTreefromPreorderandInorderTraversal();
        c.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
    }
    int[] preorder;
    static int index = 0;
    HashMap<Integer, Integer> inorder = new HashMap<>();
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
          this.preorder = preorder;
          index = 0;
        for (int i = 0; i < inorder.length; i++) {
            this.inorder.put(inorder[i], i);
        }
        return DFS(0, preorder.length - 1);
    }

    public TreeNode DFS(int start, int end)
    {
        if(start > end)
        {
            return null;
        }
        int rootValue = preorder[index++];
        TreeNode root = new TreeNode(rootValue);
        int rootIndex = inorder.get(rootValue);

        root.left = DFS(start, rootIndex - 1);
        root.right = DFS(rootIndex + 1, end);

        return root;
    }
}
