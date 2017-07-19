
public class Stack {
	int size;
	Student[] stack;
	int top=-1;
	public Stack(int size)
	{
		this.size=size;
		stack=new Student[size];
	}
	public void push(Student st)
	{
		if(top+1>=size)
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			stack[top]=st;
		}
	}
	public Student pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return null;
			
		}
		else
		{
			top--;
			return stack[top+1];
		}
	}
	public Student top()
	{
		if(top==-1)
		{
		  System.out.println("Stack is empty");
		  return null;
		}
		else
		{
			return stack[top];
		}
	}
	public void displayStack()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack[i].name);
		}
	}

}
