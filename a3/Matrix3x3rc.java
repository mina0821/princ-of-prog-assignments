package cs2s03;

public class Matrix3x3rc {
	//nested private class containing columns of values
	public static class Row3 {
		
		//Row3 fields
		private long[][] row= new long [3][3];
		//Initialize constructor
		public Row3 (long[] arr) {
			this.row[0] = new long [] {arr[0],arr[1],arr[2]};
			this.row[1] = new long [] {arr[3],arr[4],arr[5]};
			this.row[2] = new long [] {arr[6],arr[7],arr[8]};
		}
		
		//get value
		public long[] getVal() {
			//array length -> n x n matrix
			int n = this.row.length;
			
			long [] r = new long [n*n];
			//copy into the flat array
			for (int i=0;i<n;i++) {
				System.arraycopy(row[i], 0, r , i*3, n);
			}
			return r;
		}
	}
	
	// matrix fields
	private Row3 mat;
	// initialize constructor
	public Matrix3x3rc (long [] arr) throws WrongLength{
		int len = arr.length;
		if (len !=9) {
			throw new WrongLength(len,9, "Matrix3x3rc");
		}
		this.mat = new Row3 (arr);	
	}
	public Matrix3x3rc() {
		this.mat = new Row3(new long[]{99,99,99,99,99,99,99,99,99});
	}
	// getValue by calling Row3.getVal()
	public long[] toArray() {
		return this.mat.getVal();
	}
	
	//copy a matrix
	public Matrix3x3rc copy() {
			Matrix3x3rc copy = null;
			long[] arr = mat.getVal();
			//create a new matrix with the same array
			try {
				copy = new Matrix3x3rc(arr);
			} catch (WrongLength e) {
				System.out.println(e.FormatError());
			}
			return copy;
		}
		
		//identity matrix
	public Matrix3x3rc imat() {
			long[] arr = new long[]{1,0,0,0,1,0,0,0,1};
			Matrix3x3rc imat = null;
			//create a new matrix with 1's array
			try {
				imat = new Matrix3x3rc(arr);
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
	public Matrix3x3rc matrixpower(int i) throws WrongPower, WrongLength{
		if (i<0) {
			throw new WrongPower(i,"Matrix3x3rc");
		}
			Matrix3x3rc result = this.copy();
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
				result.mat.row[0]=temp[0];
				result.mat.row[1]=temp[1];
				result.mat.row[2]=temp[2];
				
			}
			return result;
		}
}
