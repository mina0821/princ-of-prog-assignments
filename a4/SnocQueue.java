package cs2s03;

public class SnocQueue implements MyQueue{
	private SnocList q;


	public char peek() throws EmptyContainerException {
		if (this.q == null) {
			throw new EmptyContainerException("SnocQuene empty");
		}
		//front
		return q.toString().charAt(0);
	}


	public void dequeue() {
		//front
		if (this.isEmpty() == false) {
			//get the snoclist, reverse it
			SnocList ref = this.q.reverse(this.q);
			//get rid of the first element
			SnocList temp = ref.getL();
			//reverse back, store it
			this.q=this.q.reverse(temp);
			
		}
		
	}


	public void enqueue(char c) {
		//back
		this.q = new SnocList (this.q,c);
		
	}


	public boolean isEmpty() {
		return q==null;
	}
	
	public String toString(){
		return q.toString();
	}
	
	public boolean equals(SnocQueue l){
		if (this.isEmpty()){
			if (l.isEmpty()){
				return true;
			}
		}
		return this.q.equals(l.q);
	}

}
