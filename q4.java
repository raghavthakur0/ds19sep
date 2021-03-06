import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
public class q4
{
	Node head;
	public void create(int n)
	{
		Scanner s = new Scanner(System.in);
		Node tmp = null;
		while(n > 0)
		{
			n--;
			System.out.println("Enter the data to insert");
			int d = s.nextInt();
			Node newnode = new Node();
			newnode.data = d;
			if(head == null)
			{
				head = newnode;
				tmp = newnode;
			}
			else
			{
				tmp.next = newnode;
				tmp = tmp.next;
			}
		}
	}
	public void display()
	{
		Node tmp = head;
		while(tmp != null)
		{
			System.out.println(tmp.data + " ");
			tmp = tmp.next;
		}
	}
	public void reverse()
	{
		Node cur = head, prev = null, next = null;
		while(cur != null)
		{
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur =  next;
		}
		head = prev;
	}
	public void copy(PalindromeLinkedList o)
	{
		Node tmp = o.head, ptr = null;
		while(tmp != null)
		{
			if(head == null)
			{
				head = tmp;
				ptr = tmp;
				tmp = tmp.next;
			}
			else
			{
				ptr.next = tmp;
				ptr = ptr.next;
				tmp = tmp.next;
			}
		}
	}
	public boolean palin(PalindromeLinkedList o)
	{
		Node tmp = o.head,ptr = head;
		while(tmp != null)
		{
			if(tmp.data != ptr.data) return false;
			tmp = tmp.next;
			ptr = ptr.next;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list");
		int n = sc.nextInt();
		PalindromeLinkedList obj = new PalindromeLinkedList();
		obj.create(n);
		System.out.println("original linklist is");
		//obj.display();
		PalindromeLinkedList o = new PalindromeLinkedList();
		o.copy(obj);
		o.reverse();
		if(o.palin(obj)) System.out.println("Yes palindrome");
		else System.out.println("Not palindrome");
	}
}