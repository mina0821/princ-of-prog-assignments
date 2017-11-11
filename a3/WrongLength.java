package cs2s03;

public class WrongLength extends Throwable{
	private int len;
	private int n;
	private String name;
	

	public WrongLength(int len, int n, String name) {
		this.len = len;
		this.name = name;
		this.n = n;
	}
	

	public String FormatError() {
		return "Incorrect array size: " + this.len 
				+ "(expected "+ n +") at " + this.name;
	}

}
