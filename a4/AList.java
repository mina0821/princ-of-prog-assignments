package cs2s03;

public class AList {
	private char hd;
	private int priority;
	private AList tl;
	
	//constructor
	public AList (final char a, final int b, final AList ll) {
		this.setHd(a);
		this.setPriority(b);
		this.setTl(ll);
	}
	
	//copy a list
	public AList copy(){
		if (this.getTl()==null) return new AList(this.getHd(),this.getPriority(),null);
		AList p = this.getTl();
		AList q = new AList(this.getTl().getHd(),this.getTl().getPriority(),null);
		AList r = q;
		while (p.getTl() != null) {
			q.setTl(new AList(p.getTl().getHd(),p.getTl().getPriority(),null));
			q = q.getTl();
			p = p.getTl();
		}
		return new AList(this.getHd(),this.getPriority(),r);
	}
	
	//return the size of the list
	public int size(){
		int n = 1;
		AList temp = this.copy();
		while (temp.getTl() != null) {
			n = n + 1;
			temp.pop();
		}
		return n;
	}

	
	//pop
	public void pop() {
		//removes the first element
		this.setHd(this.getTl().getHd());
		this.setPriority(this.getTl().getPriority());
		this.setTl(this.getTl().getTl());
		
	}
	
	//String representation
	public String toString(){
		AList temp = this.copy();
		String r = "";
		if (temp==null) return r;
		while (temp.getTl() != null) {
			r = r + temp.getPriority();
			r = r + temp.getHd();
			r = r + " ";
			temp.pop();
		}
		r = r + temp.getPriority();
		r = r + temp.getHd();
		return r;
	}
	
	
	//test equals
	public boolean equals(AList l) {
		while (this.getTl() != null) {
			if (this.getHd() != l.getHd()) {
				return false;
			}
			if (this.getPriority() != l.getPriority()){
				return false;
			}
			this.pop();
			l.pop();
		}
		return true;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public char getHd() {
		return hd;
	}

	public void setHd(char hd) {
		this.hd = hd;
	}

	public AList getTl() {
		return tl;
	}

	public void setTl(AList tl) {
		this.tl = tl;
	}

}
