package cs2s03;

public class MatrixArrayRC {
	
	//fields long[row][columns]
	private long [] [] mat;
	
	//constructor
	public MatrixArrayRC (int n, long[] arr) throws WrongLength{
		//calculate # of columns and rows
		int len = (int)Math.sqrt(arr.length);
		if (len!=n) {
			throw new WrongLength(arr.length,n*n,"MatrixArrayRC");
		}
		
		//create empty matrix
		this.mat = new long [len][len];
		
		//matrix[row]
		for (int row=0; row<len; row++) {
			//matrix[row][column]
			for (int col=0; col<len; col++){
				mat[row][col] = arr[row*len+col];
			}
		}
	}
	
	//second constructor
	public MatrixArrayRC (long[] arr) throws WrongLength{
		int len = arr.length;
		if (len!=9) {
			throw new WrongLength(len, 9, "MatrixArrayRC");
		}
		//matrix[row][col]
		mat = new long [3][3];
		System.arraycopy(arr, 0, mat[0], 0, 3);
		System.arraycopy(arr, 3, mat[1], 0, 3);
		System.arraycopy(arr, 6, mat[2], 0, 3);
	}
	
	//null
	public MatrixArrayRC() {
		this.mat = new long [][]{{99,99,99},{99,99,99},{99,99,99}};
	}
		
	//get Val
	public long[] toArray() {
		//array length -> n x n matrix
		int n = mat.length;
		
		long [] r = new long [n*n];
		//copy into the flat array
		for (int i=0;i<n;i++) {
			System.arraycopy(mat[i], 0, r , i*3, n);
		}
		return r;
	}
	
	//copy a matrix
	public MatrixArrayRC copy() {
		MatrixArrayRC copy = null;
		long[] arr = this.toArray();
		//create a new matrix with the same array
		try {
			copy = new MatrixArrayRC(arr);
		} catch (WrongLength e) {
			System.out.println(e.FormatError());
		}
		return copy;
	}
	
	//identity matrix
	public MatrixArrayRC imat() {
		int len = mat.length;
		long[] arr = new long[mat.length*mat.length];
		for(long zero:arr){
			zero=0;
		}
		for(int i=0;i<mat.length*mat.length;i=i+len+1){
			arr[i]=1;
		}
		MatrixArrayRC imat = null;
		//create a new matrix with 1's array
		try {
			imat = new MatrixArrayRC(arr);
		} catch (WrongLength e) {
			System.out.println(e.FormatError());
		}
		return imat;
	}
	
	//return an array of row i
	public long[] row(int i) {
		return mat[i-1];
	}
	
	//return an array of col i
	public long[] col(int i) {
		int len = mat.length;
		long[] col = new long[len];
		
		//first element of the col
		int head = i-1;
		
		//fill in value
		for (int lo=0;lo<len;lo++) {
			col[lo]=this.toArray()[head+lo*len];
		}
		return col;
	}
	
	//matrix power
	public MatrixArrayRC matrixpower(int i) throws WrongPower, WrongLength{
		if (i<0) {
			throw new WrongPower(i,"Matrix3x3RC");
		}
		MatrixArrayRC result = this.copy();
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
			result.mat=temp;
			
		}
		return result;
	}

}
