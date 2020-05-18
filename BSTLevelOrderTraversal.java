import java.util.ArrayList;
import java.util.Scanner;
class NodeL{
    NodeL left,right;
    int data;
    NodeL(int data){
        this.data=data;
        left=right=null;
    }
}

class BSTLevelOrderTraversal{
    static void levelOrder(NodeL root){
        ArrayList<NodeL> list = new ArrayList<>();
        if (root != null)
            list.add(root);
        while(!list.isEmpty()) {
            System.out.print(list.get(0).data + " ");
            if (list.get(0).left != null)
                list.add(list.get(0).left);
            if (list.get(0).right != null)
                list.add(list.get(0).right);
            list.remove(0);
        }
    }

    public static NodeL insert(NodeL root,int data){
        if(root==null){
            return new NodeL(data);
        }
        else{
            NodeL cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        NodeL root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}