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
public class q1
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
	Node swapElements(Node head, int pos1, int pos2)
	{
		Node prev = head;
		Node curr = head;
		
		if(head == null)
		{
			return head;
		}
		
		else
		{
			for(int i=0;i<pos1;i++)
			{
				prev = prev.next;
			}
			for(int i=0;i<pos2;i++)
			{
				curr = curr.next;
			}
			
			int var = prev.data;
			prev.data = curr.data;
			curr.data = var;
		}
		
		return head;
	}
	public static void main(String[] x)
	{
	    Node head = null;
		SwapElementsLinkedList obj = new SwapElementsLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		head = obj.create(n,head);
		System.out.print("Display: ");
		obj.display(head);
		System.out.println("\nEnter positions you want to swap: ");
		int pos1 = sc.nextInt();
		int pos2 = sc.nextInt();
		System.out.print("\nSwapping two elements: ");
		obj.swapElements(head, pos1, pos2);
		obj.display(head);
	}
}