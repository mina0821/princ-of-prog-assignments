package cs2s03;

public class MatrixArrayCR {
	
	//fields long[columns][rows]
	private long [] [] mat;
	
	//constructor
	public MatrixArrayCR (int n, long[] arr) throws WrongLength{
		//calculate # of columns and rows 
		int len = (int) Math.sqrt(arr.length);
		if (len!=n) {
			throw new WrongLength(arr.length,n*n,"MatrixArrayCR");
		}
		
		//create empty matrix
		this.mat = new long [len][len];
		
		//matrix[col]
		for (int col=0; col<len; col++) {
			//matrix[col][row]
			for (int row=0; row<len; row++) {
				mat[col][row] = arr[row*len+col];
			}
		}
	}
	
	//second constructor
	public MatrixArrayCR (long[] arr) throws WrongLength{
		int len = arr.length;
		if (len!=9) {
			throw new WrongLength(len, 9, "MatrixArrayCR");
		}
		//matrix[row][col]
		mat = new long [3][3];
		mat[0] = new long [] {arr[0],arr[3],arr[6]};
		mat[1] = new long [] {arr[1],arr[4],arr[7]};
		mat[2] = new long [] {arr[2],arr[5],arr[8]};
	}
	
	public MatrixArrayCR() {
		this.mat = new long [][]{{99,99,99},{99,99,99},{99,99,99}};
	}
		
	//get Val
	public long[] toArray() {
		//array length -> n x n matrix
		int n = mat.length;
		
		long [] r = new long [n*n];
		//copy into the flat array
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				r[i+n*j]=mat[i][j];
			}
		}
		return r;
	}
	
	//copy a matrix
	public MatrixArrayCR copy() {
		MatrixArrayCR copy = null;
		long[] arr = this.toArray();
		//create a new matrix with the same array
		try {
			copy = new MatrixArrayCR(arr);
		} catch (WrongLength e) {
			System.out.println(e.FormatError());
		}
		return copy;
	}
	
	//identity matrix
	public MatrixArrayCR imat() {
		int len = mat.length;
		long[] arr = new long[mat.length*mat.length];
		for(long zero:arr){
			zero=0;
		}
		for(int i=0;i<mat.length*mat.length;i=i+len+1){
			arr[i]=1;
		}
		MatrixArrayCR imat = null;
		//create a new matrix with 1's array
		try {
			imat = new MatrixArrayCR(arr);
		} catch (WrongLength e) {
			System.out.println(e.FormatError());
		}
		return imat;
	}
	
	//return an array of row i
	public long[] row(int i) {
		int len = mat.length;
		//create an array with proper length
		long[] row = new long[len];
		
		//first element of the row pos
		int head = (i-1)*len;
		
		//fill in value
		for (int lo=0;lo<len;lo++) {
			row[lo]=this.toArray()[head+lo];
		}
		return row;
	}
	
	//return an array of col i
	public long[] col(int i) {
		return mat[i-1];
	}
	
	//matrix power
	public MatrixArrayCR matrixpower(int i) throws WrongPower, WrongLength{
		if (i<0) {
			throw new WrongPower(i,"MatrixArrayCR");
		}
		MatrixArrayCR result = this.copy();
		int len = mat.length;
		
		//A^1 = A
		if (i==1) {
			return result;
		}
		
		//A^0 = Identity matrix
		if (i==0) {
			return this.imat();
		}
		
		//multiplying i times
		for (int n=1; n<i; n++) {
			
			//convert result into double array temp
			//create empty matrix
			long[][] temp = new long [len][len];
			
			//matrix[row]
			for (int row=0; row<len; row++) {
				//matrix[row][column]
				for (int col=0; col<len; col++){
					temp[row][col] = result.toArray()[row*len+col];
				}
			}
			
			//calculate temp[row][col]
			for (int row=1;row<=len;row++) {
				for (int col=1;col<=len;col++) {
					//temp[row][col]= r.row(row) * original.col(col)
					long tempr = 0;
					//multiplying two array matrix
					for (int pos=0;pos<len;pos++) {
						tempr += result.row(row)[pos] * this.col(col)[pos];
					}
					//input the value
					temp[row-1][col-1] = tempr;
				}
			}
			
			//convert temp back into result matrix
			//matrix[row]
			for (int row=0; row<len; row++) {
				//matrix[row][column]
				for (int col=0; col<len; col++){
					result.mat[col][row] = temp[row][col];
				}
			}
			
		}
		return result;
	}

}
