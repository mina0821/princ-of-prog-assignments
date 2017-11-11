package cs2s03;

import java.util.Arrays;

public class MatrixArrayFlat {
	
	//fields
	private long [] mat;

	//constructor
	public MatrixArrayFlat (long[] arr) throws WrongLength{
		int len = arr.length;
		if (len !=9) {
			throw new WrongLength(len, 9,"MatrixArrayFlat");
		}
		this.mat = Arrays.copyOf(arr, arr.length);
	}
	
	//second constructor
	public MatrixArrayFlat (int n, long[] arr) throws WrongLength{
		int len = (int)Math.sqrt(arr.length);
		if (len !=n) {
			throw new WrongLength(arr.length,n*n, "MatrixArrayFlat");
		}
		this.mat = Arrays.copyOf(arr, arr.length);
	}
	
	//null
	public MatrixArrayFlat() {
		this.mat = new long[]{99,99,99,99,99,99,99,99,99};
	}
	
	public long[] toArray() {
		return this.mat;
	}
	
	//copy a matrix
	public MatrixArrayFlat copy() {
		MatrixArrayFlat copy = null;
		long[] arr = Arrays.copyOf(mat, mat.length);
		//create a new matrix with the same array
		try {
			copy = new MatrixArrayFlat(arr);
		} catch (WrongLength e) {
			System.out.println(e.FormatError());
		}
		return copy;
	}
	
	//identity matrix
	public MatrixArrayFlat imat() {
		int len = (int)Math.sqrt(mat.length);
		long[] arr = new long[mat.length];
		for(long zero:arr){
			zero=0;
		}
		for(int i=0;i<mat.length;i=i+len+1){
			arr[i]=1;
		}
		MatrixArrayFlat imat = null;
		//create a new matrix with 1's array
		try {
			imat = new MatrixArrayFlat(arr);
		} catch (WrongLength e) {
			System.out.println(e.FormatError());
		}
		return imat;
	}
	
	//return an array of row i
	public long[] row(int i) {
		int len = (int)Math.sqrt(mat.length);
		//create an array with proper length
		long[] row = new long[len];
		
		//first element of the row pos
		int head = (i-1)*len;
		
		//fill in value
		for (int lo=0;lo<len;lo++) {
			row[lo]=mat[head+lo];
		}
		return row;
	}
	
	//return an array of col i
	public long[] col(int i) {
		int len = (int)Math.sqrt(mat.length);
		long[] col = new long[len];
		
		//first element of the col
		int head = i-1;
		
		//fill in value
		for (int lo=0;lo<len;lo++) {
			col[lo]=mat[head+lo*len];
		}
		return col;
	}
	
	//matrix power
	public MatrixArrayFlat matrixpower(int i) throws WrongPower, WrongLength{
		if (i<0) {
			throw new WrongPower(i,"MatrixArrayFlat");
		}
		MatrixArrayFlat result = this.copy();
		int len = (int)Math.sqrt(mat.length);
		
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
					result.mat[row*len+col] = temp[row][col];
				}
			}
			
		}
		return result;
	}
}
