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
public class q2
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
	Node remove_dup(Node head)
	{
		Node prev = head;
		Node curr = prev.next;
		while(curr!=null)
		{
			if(prev.data==curr.data)
			{
				curr = curr.next;
				prev.next = curr;
			}
			else{
				curr = curr.next;
				prev = prev.next;
			}
		}
		return head;
	}
	
	
	public static void main(String[] x)
	{
	    Node head = null;
		RemoveDuplicatesLinkedList obj = new RemoveDuplicatesLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		head = obj.create(n,head);
		System.out.print("Display: ");
		obj.display(head);
		System.out.print("\nRemoving duplicates: ");
		obj.remove_dup(head);
		obj.display(head);
	}
}