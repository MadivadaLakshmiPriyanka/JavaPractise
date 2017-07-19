
public class Mainl {
public static void main(String args[])
{
	Node n=new Node(0);
	LinkedList s=new LinkedList();
	s.add(8);
	s.add(4);
	s.add(0);
	s.display();
	s.delete(4);
	s.display();
	System.out.println(s.head.a);
	System.out.println(s.tail.a);
}
}
