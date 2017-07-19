
public class LinkedList {
	Node head;
	Node tail;
	public LinkedList()
	{
		
	}
	public void add(int a)
	{
		if(head==null)
		{
			head=new Node(a);
			tail=head;
			
		}
		else
		{
			tail.next=new Node(a);
			tail=tail.next;
		}
	}
public void display()
{
	if(head!=null)
	{
		Node temp=head;
		System.out.println(temp.a);
		while(temp.next!=null)
		{
			System.out.println(temp.next.a);
			temp=temp.next;
		}
		
	}

else
{
	System.out.println("Linkedlist is empty");
}
}
public void delete(int a)
{
	Node temp=head;
	if(head.a==a)
	{
		head=head.next;
	}
	else
	{
		while(temp.next!=null)
		{
			if(temp.next.a==a)
			{
				temp.next=temp.next.next;
			}
			else
			{
				temp=temp.next;
			}
		}
	}
}
}