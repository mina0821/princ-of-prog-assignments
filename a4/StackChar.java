package cs2s03;
import java.util.ArrayList;
import java.util.Arrays;

public class StackChar implements MyStack{
	private ArrayList<Character> c = new ArrayList<Character>();

	public char top() throws EmptyContainerException {
		//get the first element
		if (c.isEmpty()) {
			throw new EmptyContainerException("StackChar empty");
		}

		return c.get(0);
	}

	public void pop() {
		// removes the first element
		if (this.isEmpty()==false){
		this.c.remove(0);}
		
	}

	public void push(char c) {
		//insert element at front
		this.c.add(0,c);
	}


	public boolean isEmpty() {
		return c.isEmpty();
	}
	
	public String toString (){
		String r = "";
		for(char al:c){
			r = r + al;
		}
		return r;
	}
	
	public boolean equals (StackChar l) {
		return Arrays.equals(this.c.toArray(),l.c.toArray());
	}

}
