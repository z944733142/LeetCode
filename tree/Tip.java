package algorithms.tree;

        import java.util.Scanner;

public class Tip {
    String big;
    String commen;
    static int index = 0;
    class Node{
        char data;
        Node right=null;
        Node left=null;
    }
    void input(){
        Scanner in=new Scanner(System.in);
        commen=in.nextLine();
        big=in.nextLine();
    }
    Node Tree(int Left,int Right){
        if (index>big.length())return null;
        Node node=null;
        for (int i=Left;i<=Right;i++)
            if(commen.charAt(i)==big.charAt(index)){
                node=new Node();
                node.data=commen.charAt(i);
                index++;
                node.right=Tree(i + 1,Right);
                node.left=Tree(Left,i-1);
                break;
            }
        return node;
    }
    void trip(Node root){
        if (root==null) return;
        System.out.println(root.data);
        trip(root.left);
        trip(root.right);
    }
    int getsize(){
        return big.length();
    }
    public static void main(String[] args) {
        Tip A=new Tip();
        A.input();
        A.trip(A.Tree(0,A.getsize()-1));
    }
}