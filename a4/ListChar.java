package cs2s03;

class ListChar implements MyStack{
	private char hd = ' ';
	private ListChar tl;
	
	public char top() throws EmptyContainerException {
		//get the first element 
		if (this.hd == ' '){
			throw new EmptyContainerException("ListChar hd empty");
		}
		//return the first element
		return this.hd;
	}

	public void pop() {
		//removes the first element
		this.hd = this.tl.hd;
		this.tl = this.tl.tl;
		
	}

	public void push(char c) {
		//insert the element at front
		ListChar temp = new ListChar();
		temp.tl = new ListChar();
		temp.tl.hd = this.hd;
		temp.tl.tl = this.tl;
		this.hd = c;
		this.tl = temp.tl;	
	}

	public boolean isEmpty() {
		if (this.tl == null) {
			return true;
		}
		return false;
	}
	
	public String toString(){
		//return String representation
		String r = "";
		while (this.tl != null) {
			r = r + this.hd;
			this.pop();
		}
		return r;
	}
	
	public boolean equals(ListChar l) {
		while (this.tl != null) {
			if (this.hd != l.hd) {
				return false;
			}
			this.pop();
			l.pop();
		}
		return true;
		
	}

}
