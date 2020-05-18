import java.util.Scanner;
class NodeD{
    int data;
    NodeD next;
    NodeD(int d){
        data=d;
        next=null;
    }

}
class MoreLinkedLists
{

    public static NodeD removeDuplicates(NodeD head) {
        NodeD cur = head;
        while (cur.next != null){
            if (cur.data == cur.next.data){
                cur.next = cur.next.next;
            }
            else
                cur = cur.next;
        }
        return head;
    }

    public static  NodeD insert(NodeD head,int data)
    {
        NodeD p=new NodeD(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            NodeD start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(NodeD head)
    {
        NodeD start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        NodeD head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}