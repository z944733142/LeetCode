package algorithms.tree;

/**
 * @author: shuo
 * @date: 2019/10/17
 */
public class Tree {
//    int[] a = new int[]{3,2,4,1,6,5};
//    int[] b =  new int[]{1,5,6,2,4,3};
//    int[] a = new int[]{3,2,1,4};
//    int[] b =  new int[]{1,4,2,3};
//int[] b = new int[]{1,2,3,4};
//    int[] a =  new int[]{4,3,2,1};
    int[] a = new int[]{2,4,1,6,5,7};
    int[] b =  new int[]{1,5,7,6,2,4};

    int index = 0;
    public static void main(String[] args) {
        Tree t = new Tree();
        TreeNode treeNode = t.func(0, t.b.length - 1, t.b[0]);
        t.show(treeNode);
    }

    public void show(TreeNode treeNode)
    {
        if(treeNode == null)
        {
            return;
        }
        System.out.println((treeNode.val));
        show(treeNode.left);
        show(treeNode.right);
    }
    public TreeNode func(int start, int end, int val)
    {
        if(start > end)
        {
            return null;
        }
        TreeNode node = null;
        int i;
        for (i = start; i <= end; i++)
        {
            if(a[i] == val)
            {
                node = new TreeNode(val);
                index++;
                if(index >= b.length)
                {
                    return node;
                }
                node.right = func(i + 1, end, b[index]);
                node.left = func(start, i , b[index]);
                break;
            }
        }
//        if(node == null)
//        {
//            return null;
//        }
//        if(index >= b.length)
//        {
//            return node;
//        }
//            TreeNode temp = func(i + 1, end, b[index]);
//            if(temp != null)
//            {
//                node.right = temp;
//            }
//        if(index >= b.length)
//        {
//            return node;
//        }
//            TreeNode temp1 = func(start, i , b[index]);
//            if(temp1 != null)
//            {
//                node.left = temp1;
//            }
        return node;

    }

}


