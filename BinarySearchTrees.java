import java.util.Scanner;

class NodeH {
    NodeH left,right;
    int data;
    NodeH(int data){
        this.data=data;
        left=right=null;
    }
}
class BinarySearchTrees{

    public static int getHeight(NodeH root){
        if (root == null){
            return -1;
        }
        else{
            return 1 + ((getHeight(root.left))>getHeight(root.right) ? getHeight(root.left) : getHeight(root.right));
        }
    }

    public static NodeH insert(NodeH root, int data){
        if(root==null){
            return new NodeH(data);
        }
        else{
            NodeH cur;
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
        NodeH root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
