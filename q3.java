import java.util.Scanner;
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
	}
}
public class q3
{
	Node create(int n, Node head)
	{
        Node temp = null;
        while(n>0)
		{
            Scanner sc = new Scanner(System.in);
			int d = sc.nextInt();
            Node newnode = new Node(d);		
            newnode.data = d;
            
            if(head == null)
            {
                head = newnode;
				temp = head;
			}
			else
			{
				temp.next = newnode;
				temp = temp.next;
			}
			n--;
		}
		return head;
	}
	Node display(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		return head;
	}
	Node merge(Node head1, Node head2)
	{
		Node newhead = null;
		Node curr = newhead;
		Node temp1 = head1;
		while(temp1!=null)
		{
			curr = temp1;
			temp1 = temp1.next;
			curr = curr.next;
		}
		Node temp2 = head2;
		while(temp2!=null)
		{
			curr = temp2;
			temp2 = temp2.next;
			curr = curr.next;
		}
		return newhead;
	}	
	public static void main(String[] x)
	{
	    Node head = null;
		Node head1 = null;
		Node head2 = null;
		MergeLinkedList obj = new MergeLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of linked list 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter elements: ");
		obj.create(n1,head1);
		System.out.println("Enter size of linked list 2 : ");
		int n2 = sc.nextInt();
		System.out.println("Enter elements: ");
		obj.create(n2,head2);
		obj.merge(head1,head2);
		obj.display(head);
		
	}
}