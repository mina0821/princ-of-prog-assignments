package cs2s03;

public class Matrix3x3flat {
	
	// nested class
	private static class Record9 {
		// 9 fields
		public long a1,a2,a3,a4,a5,a6,a7,a8,a9;
		// initialize constructor 
		public Record9 (long [] arr) {
			this.a1 = arr[0];
			this.a2 = arr[1];
			this.a3 = arr[2];
			this.a4 = arr[3];
			this.a5 = arr[4];
			this.a6 = arr[5];
			this.a7 = arr[6];
			this.a8 = arr[7];
			this.a9 = arr[8];
		}
		// return array of elements
		public long [] getVal () {
			long [] r = new long[] 
					      {a1,a2,a3,a4,a5,a6,a7,a8,a9};
			return r;
		}
	}
	
	// fields
	private Record9 mat;
	// initialize constructor
	public Matrix3x3flat (long [] arr) throws WrongLength{
		int len = arr.length;
		if (len !=9) {
			throw new WrongLength(len,9, "Matrix3x3flat");
		}
		this.mat = new Record9 (arr);	
	}
	public Matrix3x3flat() {
		this.mat=new Record9(new long[]{99,99,99,99,99,99,99,99,99});
	}
	// return array of elements by calling Record9.getVal()
	public long [] toArray () {
		return this.mat.getVal();
	}
	
	//copy a matrix
	public Matrix3x3flat copy() {
		Matrix3x3flat copy = null;
		long[] arr = mat.getVal();
		//create a new matrix with the same array
		try {
			copy = new Matrix3x3flat(arr);
		} catch (WrongLength e) {
			System.out.println(e.FormatError());
		}
		return copy;
	}
	
	//identity matrix
	public Matrix3x3flat imat() {
		long[] arr = new long[]{1,0,0,0,1,0,0,0,1};
		Matrix3x3flat imat = null;
		//create a new matrix with 1's array
		try {
			imat = new Matrix3x3flat(arr);
		} catch (WrongLength e) {
			System.out.println(e.FormatError());
		}
		return imat;
	}
	
	//return an array of row i
	public long[] row(int i) {
		int len = (int)Math.sqrt(this.toArray().length);
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
		int len = (int)Math.sqrt(this.toArray().length);
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
	public Matrix3x3flat matrixpower(int i) throws WrongPower, WrongLength{
		if (i<0) {
			throw new WrongPower(i,"Matrix3x3flat");
		}
		Matrix3x3flat result = this.copy();
		int len = (int)Math.sqrt(this.toArray().length);
		
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
			result.mat.a1=temp[0][0];
			result.mat.a2=temp[0][1];
			result.mat.a3=temp[0][2];
			result.mat.a4=temp[1][0];
			result.mat.a5=temp[1][1];
			result.mat.a6=temp[1][2];
			result.mat.a7=temp[2][0];
			result.mat.a8=temp[2][1];
			result.mat.a9=temp[2][2];
			
		}
		return result;
	}
}
