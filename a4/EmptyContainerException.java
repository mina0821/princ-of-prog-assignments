package cs2s03;

public class EmptyContainerException extends Throwable {
    private String kind;

    public EmptyContainerException(String s) { this.kind = s; }
    
    public String error(){
    	return this.kind;
    }
	

}
