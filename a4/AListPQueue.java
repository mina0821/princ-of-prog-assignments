package cs2s03;

public class AListPQueue implements MyPriorityQueue{
	private AList l;

	public char next() throws EmptyContainerException {
		if (this.isEmpty()) {
			throw new EmptyContainerException("AListPQueue empty");
		}
		// highest priority
		return l.getHd();
	}

	public void deleteItem() {
		if(l.getTl()==null){
			l=null;
		}else{
		l.setHd(l.getTl().getHd());
		l.setPriority(l.getTl().getPriority());
		l.setTl(l.getTl().getTl());}
		// delete highest priority
		
	}

	public void insertItem(int p, char c) {
		// int priority, then alphabetical
		this.l = new AList(c,p,this.l);
		this.sort();
		
	}

	public boolean isEmpty() {
		return this.l==null;
	}

	
	//sort, according to priority
	public void sort(){
		if (this.isEmpty() == false) {
		//initilize variable
		int[] prio =new int[l.size()]; //stores priority
		char[] hd =new char[l.size()]; //stores hd
		
		AList temp = this.l.copy();
		int n=0;
		while (temp.getTl() != null) {
			prio[n]=temp.getPriority();
			hd[n]=temp.getHd();
			n=n+1;
			temp.pop();
		}
		prio[n]=temp.getPriority();
		hd[n]=temp.getHd();
		
		
		//bubble sort
		boolean swapped = true;
		int j = 0; int tmp; char tmp2;
		while (swapped) {
			swapped = false;
			j++;
			for (int i=0; i<l.size()-j;i++){
				if (prio[i] > prio[i+1]) {
					tmp = prio[i];
					tmp2 = hd[i];
					prio[i]=prio[i+1];
					hd[i]=hd[i+1];
					prio[i+1]=tmp;
					hd[i+1]=tmp2;
					swapped=true;
				}
				if (prio[i]==prio[i+1]) {
					//sort alphabetically
					if (hd[i]>hd[i+1]) {
						tmp = prio[i];
						tmp2 = hd[i];
						prio[i]=prio[i+1];
						hd[i]=hd[i+1];
						prio[i+1]=tmp;
						hd[i+1]=tmp2;
						swapped=true;
					}
				}
			}
		}
		//load the data back into the queue
		n = l.size();
		//start from lowest priority
		this.l = new AList(hd[0],prio[0],null);
		for (int i=1;i<n;i++) {
			this.l = new AList(hd[i],prio[i],this.l);
		}
	}}
	
	
	//pop
	public void pop() {
		if (this.isEmpty() == false){
		//removes the first element
		this.l.pop();}
		
	}
	
	
	public String toString(){
		if (isEmpty()) return null;
		return this.l.toString();
	}
	
	public boolean equals(AListPQueue pq) {
		if (l==null){
			if (pq.l==null){
				return true;
			}
		}
		return this.l.equals(pq.l);
	}

}
