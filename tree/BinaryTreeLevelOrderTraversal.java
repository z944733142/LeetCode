package algorithms.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 * 临界点队列的长度即该层的节点数
 * @author: shuo
 * @date: 2019/08/06
 */
public class BinaryTreeLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();

        LinkedList<TreeNode> q = new LinkedList<>();
        if(root != null) {
            q.add(root);
        }
        while (q.size() != 0) {
            List<Integer> integerList = new ArrayList<>();
            int length = q.size();
            for (int i = 0; i < length; i++) {
                TreeNode node = q.pop();
                integerList.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
                }
            list.add(integerList);
        }
        return list;
    }
}
