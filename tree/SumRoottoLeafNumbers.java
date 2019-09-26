package algorithms.tree;

/**
 * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 *
 * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
 *
 * 计算从根到叶子节点生成的所有数字之和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 *     1
 *    / \
 *   2   3
 * 输出: 25
 * 解释:
 * 从根到叶子节点路径 1->2 代表数字 12.
 * 从根到叶子节点路径 1->3 代表数字 13.
 * 因此，数字总和 = 12 + 13 = 25.
 * @author: shuo
 * @date: 2019/09/26
 */
public class SumRoottoLeafNumbers {
    public static void main(String[] args) {
        SumRoottoLeafNumbers sumRoottoLeafNumbers = new SumRoottoLeafNumbers();

        TreeNode a1 = new TreeNode(1);
        a1.left = new TreeNode(5);
        a1.right = new TreeNode(1);
        System.out.println(sumRoottoLeafNumbers.sumNumbers(a1));
    }
    int sum = 0;
    public int sumNumbers(TreeNode root) {
         dfs(root, 0);
         return sum;
    }

    public void dfs(TreeNode node, int val)
    {
        if(node == null)
        {
            return ;
        }
        val = val * 10 + node.val;
        if(node.right == null && node.left == null)
        {
            sum += val;
            return;
        }
        dfs(node.right, val);
        dfs(node.left, val);
    }
}
