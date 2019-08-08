package algorithms.tree;

import java.util.LinkedList;

/**
 * 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 *
 * @author: shuo
 * @date: 2019/08/07
 */
public class PopulatingNextRightPointersinEachNode {
    public static void main(String[] args) {
    }
    public Node connect(Node root) {
        LinkedList<Node> linkedList = new LinkedList();
        linkedList.add(root);
        if(root == null)
        {
            return null;
        }
        while (linkedList.size() != 0)
        {
            int length = linkedList.size();
            for (int i = 0; i < length; i++) {
                Node node = linkedList.pop();
                System.out.println(node.val);
                if(i == length - 1)
                {
                    node.next = null;
                }else
                {
                    node.next = linkedList.peek();
                }
                if(node.right != null) {
                    linkedList.add(node.right);
                    linkedList.add(node.left);
                }
            }

        }
        return root;
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};