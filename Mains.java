
public class Mains {
	public static void main(String args[])
	{
		Stack st=new Stack(5);
		st.push(new Student(100,"Raju"));
		st.push(new Student(101,"Prince"));
		st.push(new Student(102,"Mahesh"));
		st.displayStack();
		st.pop();
		st.displayStack();
	}

}
