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
public class q5
{
	Node head;
	void create(int n)
	{
		Node temp = null;
		while(n>0)
		{
			Scanner sc = new Scanner(System.in);
			int d = sc.nextInt();
			Node newnode = new Node(d);
			newnode.data = d;
			if(head==null)
			{
				head = newnode;
				temp = head;
			}
			else
			{
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=newnode;
			}
			n--;
		}
	}
	void reverse()
	{
		Node prev = null;
		Node curr = head;
		Node next = null;
		
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
		    curr = next;
		}
     head = prev;
	}	 
	void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LinkedListReverse obj = new LinkedListReverse();
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		System.out.println("Create linked list: ");
		obj.create(n);
		System.out.println("Linked list : ");
		obj.display();
		obj.reverse();
		System.out.println("Reverse : ");
		obj.display();
	}
}
			