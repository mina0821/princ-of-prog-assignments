package cs2s03;

public class SnocList {
	private char c;
	private SnocList l;
	
	public SnocList(SnocList l, char c) {
		this.setC(c);
		this.setL(l);
	}
	
	//add
	public SnocList add (SnocList x, char y){
		if (x==null) return new SnocList(null,y);
		return new SnocList(add(x.getL(),y),x.getC());
	}
	
	//reverse
	public SnocList reverse (SnocList x) {
		if (x==null) return null;
		return add(reverse(x.getL()),x.getC());
	}
	
	//pop
	public void pop() {
		//removes the first element
		this.setC(this.getL().getC());
		this.setL(this.getL().getL());
	}
	
	
	//String representation
	public String toString(){
		String r = "";
		SnocList temp = reverse(this.getL());
		if (temp==null){
			r = r + this.getC();
			return r;
		}
		while (temp.getL() != null) {
			r = r + temp.getC();
			temp.pop();
		}
		r = r + temp.getC();
		r = r + this.getC();
		return r;
	}
	
	//test for equality
	public boolean equals(SnocList l){
		while (this.getL() != null) {
			if (this.getC() != l.getC()) {
				return false;
			}
			this.pop();
			l.pop();
		}
		return true;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public SnocList getL() {
		return l;
	}

	public void setL(SnocList l) {
		this.l = l;
	}
}
