package cs2s03;

import static org.junit.Assert.*;
import org.junit.Test;

public class Testing {
	private long[] m01 = new long[] {0,1,0,0,0,0,0,0,0};
	private long[] m02 = new long[] {1,2,3,4,5,6,7,8,9};
	private long[] m03 = new long[] {2,2,3,4,5,6,7,8,9};
	private long[] m04 = new long[] {3,2,3,4,5,6,7,8,9};
	private long[] m05 = new long[] {4,2,3,4,5,6,7,8,9};
	private long[] m06 = new long[] {5,2,3,4,5,6,7,8,9};
	private long[] m07 = new long[] {6,2,3,4,5,6,7,8,9};
	private long[] m08 = new long[] {7,2,3,4,5,6,7,8,9};
	private long[] m09 = new long[] {8,2,3,4,5,6,7,8,9};
	private long[] m10 = new long[] {9,2,3,4,5,6,7,8,9};
	

	@Test
	public void test() {
		//class instance creation
		Matrix3x3flat m01flat = null;
		try {
		m01flat = new Matrix3x3flat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3flat m02flat = null;
		try {
		m02flat = new Matrix3x3flat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3flat m03flat = null;
		try {
		m03flat = new Matrix3x3flat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3flat m04flat = null;
		try {
		m04flat = new Matrix3x3flat(m04);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3flat m05flat = null;
		try {
		m05flat = new Matrix3x3flat(m05);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3flat m06flat = null;
		try {
		m06flat = new Matrix3x3flat(m06);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3flat m07flat = null;
		try {
		m07flat = new Matrix3x3flat(m07);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3flat m08flat = null;
		try {
		m08flat = new Matrix3x3flat(m08);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3flat m09flat = null;
		try {
		m09flat = new Matrix3x3flat(m09);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3flat m10flat = null;
		try {
		m10flat = new Matrix3x3flat(m10);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3rc m01x3rc = null;
		try {
		m01x3rc = new Matrix3x3rc(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3rc m02x3rc = null;
		try {
		m02x3rc = new Matrix3x3rc(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3rc m03x3rc = null;
		try {
		m03x3rc = new Matrix3x3rc(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3rc m04x3rc = null;
		try {
		m04x3rc = new Matrix3x3rc(m04);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3rc m05x3rc = null;
		try {
		m05x3rc = new Matrix3x3rc(m05);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3rc m06x3rc = null;
		try {
		m06x3rc = new Matrix3x3rc(m06);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3rc m07x3rc = null;
		try {
		m07x3rc = new Matrix3x3rc(m07);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3rc m08x3rc = null;
		try {
		m08x3rc = new Matrix3x3rc(m08);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3rc m09x3rc = null;
		try {
		m09x3rc = new Matrix3x3rc(m09);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3rc m10x3rc = null;
		try {
		m10x3rc = new Matrix3x3rc(m10);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3cr m01x3cr = null;
		try {
		m01x3cr = new Matrix3x3cr(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3cr m02x3cr = null;
		try {
		m02x3cr = new Matrix3x3cr(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3cr m03x3cr = null;
		try {
		m03x3cr = new Matrix3x3cr(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3cr m04x3cr = null;
		try {
		m04x3cr = new Matrix3x3cr(m04);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3cr m05x3cr = null;
		try {
		m05x3cr = new Matrix3x3cr(m05);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3cr m06x3cr = null;
		try {
		m06x3cr = new Matrix3x3cr(m06);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3cr m07x3cr = null;
		try {
		m07x3cr = new Matrix3x3cr(m07);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3cr m08x3cr = null;
		try {
		m08x3cr = new Matrix3x3cr(m08);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3cr m09x3cr = null;
		try {
		m09x3cr = new Matrix3x3cr(m09);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		Matrix3x3cr m10x3cr = null;
		try {
		m10x3cr = new Matrix3x3cr(m10);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayFlat m01Flat = null;
		try {
		m01Flat = new MatrixArrayFlat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayFlat m02Flat = null;
		try {
		m02Flat = new MatrixArrayFlat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayFlat m03Flat = null;
		try {
		m03Flat = new MatrixArrayFlat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayFlat m04Flat = null;
		try {
		m04Flat = new MatrixArrayFlat(m04);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayFlat m05Flat = null;
		try {
		m05Flat = new MatrixArrayFlat(m05);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayFlat m06Flat = null;
		try {
		m06Flat = new MatrixArrayFlat(m06);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayFlat m07Flat = null;
		try {
		m07Flat = new MatrixArrayFlat(m07);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayFlat m08Flat = null;
		try {
		m08Flat = new MatrixArrayFlat(m08);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayFlat m09Flat = null;
		try {
		m09Flat = new MatrixArrayFlat(m09);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayFlat m10Flat = null;
		try {
		m10Flat = new MatrixArrayFlat(m10);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayRC m01ayRC = null;
		try {
		m01ayRC = new MatrixArrayRC(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayRC m02ayRC = null;
		try {
		m02ayRC = new MatrixArrayRC(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayRC m03ayRC = null;
		try {
		m03ayRC = new MatrixArrayRC(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayRC m04ayRC = null;
		try {
		m04ayRC = new MatrixArrayRC(m04);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayRC m05ayRC = null;
		try {
		m05ayRC = new MatrixArrayRC(m05);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayRC m06ayRC = null;
		try {
		m06ayRC = new MatrixArrayRC(m06);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayRC m07ayRC = null;
		try {
		m07ayRC = new MatrixArrayRC(m07);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayRC m08ayRC = null;
		try {
		m08ayRC = new MatrixArrayRC(m08);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayRC m09ayRC = null;
		try {
		m09ayRC = new MatrixArrayRC(m09);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayRC m10ayRC = null;
		try {
		m10ayRC = new MatrixArrayRC(m10);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayCR m01ayCR = null;
		try {
		m01ayCR = new MatrixArrayCR(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayCR m02ayCR = null;
		try {
		m02ayCR = new MatrixArrayCR(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayCR m03ayCR = null;
		try {
		m03ayCR = new MatrixArrayCR(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayCR m04ayCR = null;
		try {
		m04ayCR = new MatrixArrayCR(m04);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayCR m05ayCR = null;
		try {
		m05ayCR = new MatrixArrayCR(m05);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayCR m06ayCR = null;
		try {
		m06ayCR = new MatrixArrayCR(m06);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayCR m07ayCR = null;
		try {
		m07ayCR = new MatrixArrayCR(m07);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayCR m08ayCR = null;
		try {
		m08ayCR = new MatrixArrayCR(m08);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayCR m09ayCR = null;
		try {
		m09ayCR = new MatrixArrayCR(m09);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		//class instance creation
		MatrixArrayCR m10ayCR = null;
		try {
		m10ayCR = new MatrixArrayCR(m10);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}

		//create content to store result
		long[][][] content = new long[5][10][];
		
		//matrixpower(i)
		Matrix3x3flat ansm01flatneg1 = new Matrix3x3flat();
		try {
		ansm01flatneg1 = m01flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][0]=ansm01flatneg1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm01x3rcneg1 = new Matrix3x3rc();
		try {
		ansm01x3rcneg1 = m01x3rc.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][0]=ansm01x3rcneg1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm01x3crneg1 = new Matrix3x3cr();
		try {
		ansm01x3crneg1 = m01x3cr.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][0]=ansm01x3crneg1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm01Flatneg1 = new MatrixArrayFlat();
		try {
		ansm01Flatneg1 = m01Flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][0]=ansm01Flatneg1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm01ayRCneg1 = new MatrixArrayRC();
		try {
		ansm01ayRCneg1 = m01ayRC.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][0]=ansm01ayRCneg1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm01ayCRneg1 = new MatrixArrayCR();
		try {
		ansm01ayCRneg1 = m01ayCR.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][0]=ansm01ayCRneg1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm02flatneg1 = new Matrix3x3flat();
		try {
		ansm02flatneg1 = m02flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][1]=ansm02flatneg1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm02x3rcneg1 = new Matrix3x3rc();
		try {
		ansm02x3rcneg1 = m02x3rc.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][1]=ansm02x3rcneg1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm02x3crneg1 = new Matrix3x3cr();
		try {
		ansm02x3crneg1 = m02x3cr.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][1]=ansm02x3crneg1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm02Flatneg1 = new MatrixArrayFlat();
		try {
		ansm02Flatneg1 = m02Flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][1]=ansm02Flatneg1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm02ayRCneg1 = new MatrixArrayRC();
		try {
		ansm02ayRCneg1 = m02ayRC.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][1]=ansm02ayRCneg1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm02ayCRneg1 = new MatrixArrayCR();
		try {
		ansm02ayCRneg1 = m02ayCR.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][1]=ansm02ayCRneg1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm03flatneg1 = new Matrix3x3flat();
		try {
		ansm03flatneg1 = m03flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][2]=ansm03flatneg1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm03x3rcneg1 = new Matrix3x3rc();
		try {
		ansm03x3rcneg1 = m03x3rc.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][2]=ansm03x3rcneg1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm03x3crneg1 = new Matrix3x3cr();
		try {
		ansm03x3crneg1 = m03x3cr.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][2]=ansm03x3crneg1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm03Flatneg1 = new MatrixArrayFlat();
		try {
		ansm03Flatneg1 = m03Flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][2]=ansm03Flatneg1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm03ayRCneg1 = new MatrixArrayRC();
		try {
		ansm03ayRCneg1 = m03ayRC.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][2]=ansm03ayRCneg1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm03ayCRneg1 = new MatrixArrayCR();
		try {
		ansm03ayCRneg1 = m03ayCR.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][2]=ansm03ayCRneg1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm04flatneg1 = new Matrix3x3flat();
		try {
		ansm04flatneg1 = m04flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][3]=ansm04flatneg1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm04x3rcneg1 = new Matrix3x3rc();
		try {
		ansm04x3rcneg1 = m04x3rc.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][3]=ansm04x3rcneg1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm04x3crneg1 = new Matrix3x3cr();
		try {
		ansm04x3crneg1 = m04x3cr.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][3]=ansm04x3crneg1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm04Flatneg1 = new MatrixArrayFlat();
		try {
		ansm04Flatneg1 = m04Flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][3]=ansm04Flatneg1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm04ayRCneg1 = new MatrixArrayRC();
		try {
		ansm04ayRCneg1 = m04ayRC.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][3]=ansm04ayRCneg1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm04ayCRneg1 = new MatrixArrayCR();
		try {
		ansm04ayCRneg1 = m04ayCR.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][3]=ansm04ayCRneg1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm05flatneg1 = new Matrix3x3flat();
		try {
		ansm05flatneg1 = m05flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][4]=ansm05flatneg1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm05x3rcneg1 = new Matrix3x3rc();
		try {
		ansm05x3rcneg1 = m05x3rc.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][4]=ansm05x3rcneg1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm05x3crneg1 = new Matrix3x3cr();
		try {
		ansm05x3crneg1 = m05x3cr.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][4]=ansm05x3crneg1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm05Flatneg1 = new MatrixArrayFlat();
		try {
		ansm05Flatneg1 = m05Flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][4]=ansm05Flatneg1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm05ayRCneg1 = new MatrixArrayRC();
		try {
		ansm05ayRCneg1 = m05ayRC.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][4]=ansm05ayRCneg1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm05ayCRneg1 = new MatrixArrayCR();
		try {
		ansm05ayCRneg1 = m05ayCR.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][4]=ansm05ayCRneg1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm06flatneg1 = new Matrix3x3flat();
		try {
		ansm06flatneg1 = m06flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][5]=ansm06flatneg1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm06x3rcneg1 = new Matrix3x3rc();
		try {
		ansm06x3rcneg1 = m06x3rc.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][5]=ansm06x3rcneg1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm06x3crneg1 = new Matrix3x3cr();
		try {
		ansm06x3crneg1 = m06x3cr.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][5]=ansm06x3crneg1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm06Flatneg1 = new MatrixArrayFlat();
		try {
		ansm06Flatneg1 = m06Flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][5]=ansm06Flatneg1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm06ayRCneg1 = new MatrixArrayRC();
		try {
		ansm06ayRCneg1 = m06ayRC.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][5]=ansm06ayRCneg1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm06ayCRneg1 = new MatrixArrayCR();
		try {
		ansm06ayCRneg1 = m06ayCR.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][5]=ansm06ayCRneg1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm07flatneg1 = new Matrix3x3flat();
		try {
		ansm07flatneg1 = m07flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][6]=ansm07flatneg1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm07x3rcneg1 = new Matrix3x3rc();
		try {
		ansm07x3rcneg1 = m07x3rc.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][6]=ansm07x3rcneg1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm07x3crneg1 = new Matrix3x3cr();
		try {
		ansm07x3crneg1 = m07x3cr.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][6]=ansm07x3crneg1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm07Flatneg1 = new MatrixArrayFlat();
		try {
		ansm07Flatneg1 = m07Flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][6]=ansm07Flatneg1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm07ayRCneg1 = new MatrixArrayRC();
		try {
		ansm07ayRCneg1 = m07ayRC.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][6]=ansm07ayRCneg1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm07ayCRneg1 = new MatrixArrayCR();
		try {
		ansm07ayCRneg1 = m07ayCR.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][6]=ansm07ayCRneg1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm08flatneg1 = new Matrix3x3flat();
		try {
		ansm08flatneg1 = m08flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][7]=ansm08flatneg1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm08x3rcneg1 = new Matrix3x3rc();
		try {
		ansm08x3rcneg1 = m08x3rc.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][7]=ansm08x3rcneg1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm08x3crneg1 = new Matrix3x3cr();
		try {
		ansm08x3crneg1 = m08x3cr.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][7]=ansm08x3crneg1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm08Flatneg1 = new MatrixArrayFlat();
		try {
		ansm08Flatneg1 = m08Flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][7]=ansm08Flatneg1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm08ayRCneg1 = new MatrixArrayRC();
		try {
		ansm08ayRCneg1 = m08ayRC.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][7]=ansm08ayRCneg1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm08ayCRneg1 = new MatrixArrayCR();
		try {
		ansm08ayCRneg1 = m08ayCR.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][7]=ansm08ayCRneg1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm09flatneg1 = new Matrix3x3flat();
		try {
		ansm09flatneg1 = m09flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][8]=ansm09flatneg1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm09x3rcneg1 = new Matrix3x3rc();
		try {
		ansm09x3rcneg1 = m09x3rc.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][8]=ansm09x3rcneg1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm09x3crneg1 = new Matrix3x3cr();
		try {
		ansm09x3crneg1 = m09x3cr.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][8]=ansm09x3crneg1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm09Flatneg1 = new MatrixArrayFlat();
		try {
		ansm09Flatneg1 = m09Flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][8]=ansm09Flatneg1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm09ayRCneg1 = new MatrixArrayRC();
		try {
		ansm09ayRCneg1 = m09ayRC.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][8]=ansm09ayRCneg1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm09ayCRneg1 = new MatrixArrayCR();
		try {
		ansm09ayCRneg1 = m09ayCR.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][8]=ansm09ayCRneg1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm10flatneg1 = new Matrix3x3flat();
		try {
		ansm10flatneg1 = m10flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][9]=ansm10flatneg1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm10x3rcneg1 = new Matrix3x3rc();
		try {
		ansm10x3rcneg1 = m10x3rc.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][9]=ansm10x3rcneg1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm10x3crneg1 = new Matrix3x3cr();
		try {
		ansm10x3crneg1 = m10x3cr.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][9]=ansm10x3crneg1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm10Flatneg1 = new MatrixArrayFlat();
		try {
		ansm10Flatneg1 = m10Flat.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][9]=ansm10Flatneg1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm10ayRCneg1 = new MatrixArrayRC();
		try {
		ansm10ayRCneg1 = m10ayRC.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][9]=ansm10ayRCneg1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm10ayCRneg1 = new MatrixArrayCR();
		try {
		ansm10ayCRneg1 = m10ayCR.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[0][9]=ansm10ayCRneg1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm01flat0 = new Matrix3x3flat();
		try {
		ansm01flat0 = m01flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][0]=ansm01flat0.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm01x3rc0 = new Matrix3x3rc();
		try {
		ansm01x3rc0 = m01x3rc.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][0]=ansm01x3rc0.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm01x3cr0 = new Matrix3x3cr();
		try {
		ansm01x3cr0 = m01x3cr.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][0]=ansm01x3cr0.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm01Flat0 = new MatrixArrayFlat();
		try {
		ansm01Flat0 = m01Flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][0]=ansm01Flat0.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm01ayRC0 = new MatrixArrayRC();
		try {
		ansm01ayRC0 = m01ayRC.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][0]=ansm01ayRC0.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm01ayCR0 = new MatrixArrayCR();
		try {
		ansm01ayCR0 = m01ayCR.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][0]=ansm01ayCR0.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm02flat0 = new Matrix3x3flat();
		try {
		ansm02flat0 = m02flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][1]=ansm02flat0.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm02x3rc0 = new Matrix3x3rc();
		try {
		ansm02x3rc0 = m02x3rc.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][1]=ansm02x3rc0.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm02x3cr0 = new Matrix3x3cr();
		try {
		ansm02x3cr0 = m02x3cr.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][1]=ansm02x3cr0.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm02Flat0 = new MatrixArrayFlat();
		try {
		ansm02Flat0 = m02Flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][1]=ansm02Flat0.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm02ayRC0 = new MatrixArrayRC();
		try {
		ansm02ayRC0 = m02ayRC.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][1]=ansm02ayRC0.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm02ayCR0 = new MatrixArrayCR();
		try {
		ansm02ayCR0 = m02ayCR.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][1]=ansm02ayCR0.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm03flat0 = new Matrix3x3flat();
		try {
		ansm03flat0 = m03flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][2]=ansm03flat0.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm03x3rc0 = new Matrix3x3rc();
		try {
		ansm03x3rc0 = m03x3rc.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][2]=ansm03x3rc0.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm03x3cr0 = new Matrix3x3cr();
		try {
		ansm03x3cr0 = m03x3cr.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][2]=ansm03x3cr0.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm03Flat0 = new MatrixArrayFlat();
		try {
		ansm03Flat0 = m03Flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][2]=ansm03Flat0.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm03ayRC0 = new MatrixArrayRC();
		try {
		ansm03ayRC0 = m03ayRC.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][2]=ansm03ayRC0.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm03ayCR0 = new MatrixArrayCR();
		try {
		ansm03ayCR0 = m03ayCR.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][2]=ansm03ayCR0.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm04flat0 = new Matrix3x3flat();
		try {
		ansm04flat0 = m04flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][3]=ansm04flat0.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm04x3rc0 = new Matrix3x3rc();
		try {
		ansm04x3rc0 = m04x3rc.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][3]=ansm04x3rc0.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm04x3cr0 = new Matrix3x3cr();
		try {
		ansm04x3cr0 = m04x3cr.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][3]=ansm04x3cr0.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm04Flat0 = new MatrixArrayFlat();
		try {
		ansm04Flat0 = m04Flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][3]=ansm04Flat0.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm04ayRC0 = new MatrixArrayRC();
		try {
		ansm04ayRC0 = m04ayRC.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][3]=ansm04ayRC0.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm04ayCR0 = new MatrixArrayCR();
		try {
		ansm04ayCR0 = m04ayCR.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][3]=ansm04ayCR0.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm05flat0 = new Matrix3x3flat();
		try {
		ansm05flat0 = m05flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][4]=ansm05flat0.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm05x3rc0 = new Matrix3x3rc();
		try {
		ansm05x3rc0 = m05x3rc.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][4]=ansm05x3rc0.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm05x3cr0 = new Matrix3x3cr();
		try {
		ansm05x3cr0 = m05x3cr.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][4]=ansm05x3cr0.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm05Flat0 = new MatrixArrayFlat();
		try {
		ansm05Flat0 = m05Flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][4]=ansm05Flat0.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm05ayRC0 = new MatrixArrayRC();
		try {
		ansm05ayRC0 = m05ayRC.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][4]=ansm05ayRC0.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm05ayCR0 = new MatrixArrayCR();
		try {
		ansm05ayCR0 = m05ayCR.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][4]=ansm05ayCR0.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm06flat0 = new Matrix3x3flat();
		try {
		ansm06flat0 = m06flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][5]=ansm06flat0.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm06x3rc0 = new Matrix3x3rc();
		try {
		ansm06x3rc0 = m06x3rc.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][5]=ansm06x3rc0.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm06x3cr0 = new Matrix3x3cr();
		try {
		ansm06x3cr0 = m06x3cr.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][5]=ansm06x3cr0.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm06Flat0 = new MatrixArrayFlat();
		try {
		ansm06Flat0 = m06Flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][5]=ansm06Flat0.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm06ayRC0 = new MatrixArrayRC();
		try {
		ansm06ayRC0 = m06ayRC.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][5]=ansm06ayRC0.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm06ayCR0 = new MatrixArrayCR();
		try {
		ansm06ayCR0 = m06ayCR.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][5]=ansm06ayCR0.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm07flat0 = new Matrix3x3flat();
		try {
		ansm07flat0 = m07flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][6]=ansm07flat0.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm07x3rc0 = new Matrix3x3rc();
		try {
		ansm07x3rc0 = m07x3rc.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][6]=ansm07x3rc0.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm07x3cr0 = new Matrix3x3cr();
		try {
		ansm07x3cr0 = m07x3cr.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][6]=ansm07x3cr0.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm07Flat0 = new MatrixArrayFlat();
		try {
		ansm07Flat0 = m07Flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][6]=ansm07Flat0.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm07ayRC0 = new MatrixArrayRC();
		try {
		ansm07ayRC0 = m07ayRC.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][6]=ansm07ayRC0.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm07ayCR0 = new MatrixArrayCR();
		try {
		ansm07ayCR0 = m07ayCR.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][6]=ansm07ayCR0.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm08flat0 = new Matrix3x3flat();
		try {
		ansm08flat0 = m08flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][7]=ansm08flat0.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm08x3rc0 = new Matrix3x3rc();
		try {
		ansm08x3rc0 = m08x3rc.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][7]=ansm08x3rc0.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm08x3cr0 = new Matrix3x3cr();
		try {
		ansm08x3cr0 = m08x3cr.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][7]=ansm08x3cr0.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm08Flat0 = new MatrixArrayFlat();
		try {
		ansm08Flat0 = m08Flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][7]=ansm08Flat0.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm08ayRC0 = new MatrixArrayRC();
		try {
		ansm08ayRC0 = m08ayRC.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][7]=ansm08ayRC0.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm08ayCR0 = new MatrixArrayCR();
		try {
		ansm08ayCR0 = m08ayCR.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][7]=ansm08ayCR0.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm09flat0 = new Matrix3x3flat();
		try {
		ansm09flat0 = m09flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][8]=ansm09flat0.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm09x3rc0 = new Matrix3x3rc();
		try {
		ansm09x3rc0 = m09x3rc.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][8]=ansm09x3rc0.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm09x3cr0 = new Matrix3x3cr();
		try {
		ansm09x3cr0 = m09x3cr.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][8]=ansm09x3cr0.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm09Flat0 = new MatrixArrayFlat();
		try {
		ansm09Flat0 = m09Flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][8]=ansm09Flat0.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm09ayRC0 = new MatrixArrayRC();
		try {
		ansm09ayRC0 = m09ayRC.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][8]=ansm09ayRC0.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm09ayCR0 = new MatrixArrayCR();
		try {
		ansm09ayCR0 = m09ayCR.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][8]=ansm09ayCR0.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm10flat0 = new Matrix3x3flat();
		try {
		ansm10flat0 = m10flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][9]=ansm10flat0.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm10x3rc0 = new Matrix3x3rc();
		try {
		ansm10x3rc0 = m10x3rc.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][9]=ansm10x3rc0.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm10x3cr0 = new Matrix3x3cr();
		try {
		ansm10x3cr0 = m10x3cr.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][9]=ansm10x3cr0.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm10Flat0 = new MatrixArrayFlat();
		try {
		ansm10Flat0 = m10Flat.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][9]=ansm10Flat0.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm10ayRC0 = new MatrixArrayRC();
		try {
		ansm10ayRC0 = m10ayRC.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][9]=ansm10ayRC0.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm10ayCR0 = new MatrixArrayCR();
		try {
		ansm10ayCR0 = m10ayCR.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[1][9]=ansm10ayCR0.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm01flat1 = new Matrix3x3flat();
		try {
		ansm01flat1 = m01flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][0]=ansm01flat1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm01x3rc1 = new Matrix3x3rc();
		try {
		ansm01x3rc1 = m01x3rc.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][0]=ansm01x3rc1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm01x3cr1 = new Matrix3x3cr();
		try {
		ansm01x3cr1 = m01x3cr.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][0]=ansm01x3cr1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm01Flat1 = new MatrixArrayFlat();
		try {
		ansm01Flat1 = m01Flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][0]=ansm01Flat1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm01ayRC1 = new MatrixArrayRC();
		try {
		ansm01ayRC1 = m01ayRC.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][0]=ansm01ayRC1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm01ayCR1 = new MatrixArrayCR();
		try {
		ansm01ayCR1 = m01ayCR.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][0]=ansm01ayCR1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm02flat1 = new Matrix3x3flat();
		try {
		ansm02flat1 = m02flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][1]=ansm02flat1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm02x3rc1 = new Matrix3x3rc();
		try {
		ansm02x3rc1 = m02x3rc.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][1]=ansm02x3rc1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm02x3cr1 = new Matrix3x3cr();
		try {
		ansm02x3cr1 = m02x3cr.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][1]=ansm02x3cr1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm02Flat1 = new MatrixArrayFlat();
		try {
		ansm02Flat1 = m02Flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][1]=ansm02Flat1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm02ayRC1 = new MatrixArrayRC();
		try {
		ansm02ayRC1 = m02ayRC.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][1]=ansm02ayRC1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm02ayCR1 = new MatrixArrayCR();
		try {
		ansm02ayCR1 = m02ayCR.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][1]=ansm02ayCR1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm03flat1 = new Matrix3x3flat();
		try {
		ansm03flat1 = m03flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][2]=ansm03flat1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm03x3rc1 = new Matrix3x3rc();
		try {
		ansm03x3rc1 = m03x3rc.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][2]=ansm03x3rc1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm03x3cr1 = new Matrix3x3cr();
		try {
		ansm03x3cr1 = m03x3cr.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][2]=ansm03x3cr1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm03Flat1 = new MatrixArrayFlat();
		try {
		ansm03Flat1 = m03Flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][2]=ansm03Flat1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm03ayRC1 = new MatrixArrayRC();
		try {
		ansm03ayRC1 = m03ayRC.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][2]=ansm03ayRC1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm03ayCR1 = new MatrixArrayCR();
		try {
		ansm03ayCR1 = m03ayCR.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][2]=ansm03ayCR1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm04flat1 = new Matrix3x3flat();
		try {
		ansm04flat1 = m04flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][3]=ansm04flat1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm04x3rc1 = new Matrix3x3rc();
		try {
		ansm04x3rc1 = m04x3rc.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][3]=ansm04x3rc1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm04x3cr1 = new Matrix3x3cr();
		try {
		ansm04x3cr1 = m04x3cr.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][3]=ansm04x3cr1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm04Flat1 = new MatrixArrayFlat();
		try {
		ansm04Flat1 = m04Flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][3]=ansm04Flat1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm04ayRC1 = new MatrixArrayRC();
		try {
		ansm04ayRC1 = m04ayRC.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][3]=ansm04ayRC1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm04ayCR1 = new MatrixArrayCR();
		try {
		ansm04ayCR1 = m04ayCR.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][3]=ansm04ayCR1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm05flat1 = new Matrix3x3flat();
		try {
		ansm05flat1 = m05flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][4]=ansm05flat1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm05x3rc1 = new Matrix3x3rc();
		try {
		ansm05x3rc1 = m05x3rc.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][4]=ansm05x3rc1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm05x3cr1 = new Matrix3x3cr();
		try {
		ansm05x3cr1 = m05x3cr.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][4]=ansm05x3cr1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm05Flat1 = new MatrixArrayFlat();
		try {
		ansm05Flat1 = m05Flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][4]=ansm05Flat1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm05ayRC1 = new MatrixArrayRC();
		try {
		ansm05ayRC1 = m05ayRC.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][4]=ansm05ayRC1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm05ayCR1 = new MatrixArrayCR();
		try {
		ansm05ayCR1 = m05ayCR.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][4]=ansm05ayCR1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm06flat1 = new Matrix3x3flat();
		try {
		ansm06flat1 = m06flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][5]=ansm06flat1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm06x3rc1 = new Matrix3x3rc();
		try {
		ansm06x3rc1 = m06x3rc.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][5]=ansm06x3rc1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm06x3cr1 = new Matrix3x3cr();
		try {
		ansm06x3cr1 = m06x3cr.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][5]=ansm06x3cr1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm06Flat1 = new MatrixArrayFlat();
		try {
		ansm06Flat1 = m06Flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][5]=ansm06Flat1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm06ayRC1 = new MatrixArrayRC();
		try {
		ansm06ayRC1 = m06ayRC.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][5]=ansm06ayRC1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm06ayCR1 = new MatrixArrayCR();
		try {
		ansm06ayCR1 = m06ayCR.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][5]=ansm06ayCR1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm07flat1 = new Matrix3x3flat();
		try {
		ansm07flat1 = m07flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][6]=ansm07flat1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm07x3rc1 = new Matrix3x3rc();
		try {
		ansm07x3rc1 = m07x3rc.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][6]=ansm07x3rc1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm07x3cr1 = new Matrix3x3cr();
		try {
		ansm07x3cr1 = m07x3cr.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][6]=ansm07x3cr1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm07Flat1 = new MatrixArrayFlat();
		try {
		ansm07Flat1 = m07Flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][6]=ansm07Flat1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm07ayRC1 = new MatrixArrayRC();
		try {
		ansm07ayRC1 = m07ayRC.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][6]=ansm07ayRC1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm07ayCR1 = new MatrixArrayCR();
		try {
		ansm07ayCR1 = m07ayCR.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][6]=ansm07ayCR1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm08flat1 = new Matrix3x3flat();
		try {
		ansm08flat1 = m08flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][7]=ansm08flat1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm08x3rc1 = new Matrix3x3rc();
		try {
		ansm08x3rc1 = m08x3rc.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][7]=ansm08x3rc1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm08x3cr1 = new Matrix3x3cr();
		try {
		ansm08x3cr1 = m08x3cr.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][7]=ansm08x3cr1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm08Flat1 = new MatrixArrayFlat();
		try {
		ansm08Flat1 = m08Flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][7]=ansm08Flat1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm08ayRC1 = new MatrixArrayRC();
		try {
		ansm08ayRC1 = m08ayRC.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][7]=ansm08ayRC1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm08ayCR1 = new MatrixArrayCR();
		try {
		ansm08ayCR1 = m08ayCR.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][7]=ansm08ayCR1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm09flat1 = new Matrix3x3flat();
		try {
		ansm09flat1 = m09flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][8]=ansm09flat1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm09x3rc1 = new Matrix3x3rc();
		try {
		ansm09x3rc1 = m09x3rc.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][8]=ansm09x3rc1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm09x3cr1 = new Matrix3x3cr();
		try {
		ansm09x3cr1 = m09x3cr.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][8]=ansm09x3cr1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm09Flat1 = new MatrixArrayFlat();
		try {
		ansm09Flat1 = m09Flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][8]=ansm09Flat1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm09ayRC1 = new MatrixArrayRC();
		try {
		ansm09ayRC1 = m09ayRC.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][8]=ansm09ayRC1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm09ayCR1 = new MatrixArrayCR();
		try {
		ansm09ayCR1 = m09ayCR.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][8]=ansm09ayCR1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm10flat1 = new Matrix3x3flat();
		try {
		ansm10flat1 = m10flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][9]=ansm10flat1.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm10x3rc1 = new Matrix3x3rc();
		try {
		ansm10x3rc1 = m10x3rc.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][9]=ansm10x3rc1.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm10x3cr1 = new Matrix3x3cr();
		try {
		ansm10x3cr1 = m10x3cr.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][9]=ansm10x3cr1.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm10Flat1 = new MatrixArrayFlat();
		try {
		ansm10Flat1 = m10Flat.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][9]=ansm10Flat1.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm10ayRC1 = new MatrixArrayRC();
		try {
		ansm10ayRC1 = m10ayRC.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][9]=ansm10ayRC1.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm10ayCR1 = new MatrixArrayCR();
		try {
		ansm10ayCR1 = m10ayCR.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[2][9]=ansm10ayCR1.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm01flat2 = new Matrix3x3flat();
		try {
		ansm01flat2 = m01flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][0]=ansm01flat2.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm01x3rc2 = new Matrix3x3rc();
		try {
		ansm01x3rc2 = m01x3rc.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][0]=ansm01x3rc2.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm01x3cr2 = new Matrix3x3cr();
		try {
		ansm01x3cr2 = m01x3cr.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][0]=ansm01x3cr2.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm01Flat2 = new MatrixArrayFlat();
		try {
		ansm01Flat2 = m01Flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][0]=ansm01Flat2.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm01ayRC2 = new MatrixArrayRC();
		try {
		ansm01ayRC2 = m01ayRC.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][0]=ansm01ayRC2.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm01ayCR2 = new MatrixArrayCR();
		try {
		ansm01ayCR2 = m01ayCR.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][0]=ansm01ayCR2.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm02flat2 = new Matrix3x3flat();
		try {
		ansm02flat2 = m02flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][1]=ansm02flat2.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm02x3rc2 = new Matrix3x3rc();
		try {
		ansm02x3rc2 = m02x3rc.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][1]=ansm02x3rc2.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm02x3cr2 = new Matrix3x3cr();
		try {
		ansm02x3cr2 = m02x3cr.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][1]=ansm02x3cr2.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm02Flat2 = new MatrixArrayFlat();
		try {
		ansm02Flat2 = m02Flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][1]=ansm02Flat2.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm02ayRC2 = new MatrixArrayRC();
		try {
		ansm02ayRC2 = m02ayRC.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][1]=ansm02ayRC2.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm02ayCR2 = new MatrixArrayCR();
		try {
		ansm02ayCR2 = m02ayCR.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][1]=ansm02ayCR2.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm03flat2 = new Matrix3x3flat();
		try {
		ansm03flat2 = m03flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][2]=ansm03flat2.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm03x3rc2 = new Matrix3x3rc();
		try {
		ansm03x3rc2 = m03x3rc.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][2]=ansm03x3rc2.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm03x3cr2 = new Matrix3x3cr();
		try {
		ansm03x3cr2 = m03x3cr.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][2]=ansm03x3cr2.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm03Flat2 = new MatrixArrayFlat();
		try {
		ansm03Flat2 = m03Flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][2]=ansm03Flat2.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm03ayRC2 = new MatrixArrayRC();
		try {
		ansm03ayRC2 = m03ayRC.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][2]=ansm03ayRC2.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm03ayCR2 = new MatrixArrayCR();
		try {
		ansm03ayCR2 = m03ayCR.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][2]=ansm03ayCR2.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm04flat2 = new Matrix3x3flat();
		try {
		ansm04flat2 = m04flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][3]=ansm04flat2.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm04x3rc2 = new Matrix3x3rc();
		try {
		ansm04x3rc2 = m04x3rc.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][3]=ansm04x3rc2.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm04x3cr2 = new Matrix3x3cr();
		try {
		ansm04x3cr2 = m04x3cr.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][3]=ansm04x3cr2.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm04Flat2 = new MatrixArrayFlat();
		try {
		ansm04Flat2 = m04Flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][3]=ansm04Flat2.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm04ayRC2 = new MatrixArrayRC();
		try {
		ansm04ayRC2 = m04ayRC.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][3]=ansm04ayRC2.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm04ayCR2 = new MatrixArrayCR();
		try {
		ansm04ayCR2 = m04ayCR.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][3]=ansm04ayCR2.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm05flat2 = new Matrix3x3flat();
		try {
		ansm05flat2 = m05flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][4]=ansm05flat2.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm05x3rc2 = new Matrix3x3rc();
		try {
		ansm05x3rc2 = m05x3rc.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][4]=ansm05x3rc2.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm05x3cr2 = new Matrix3x3cr();
		try {
		ansm05x3cr2 = m05x3cr.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][4]=ansm05x3cr2.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm05Flat2 = new MatrixArrayFlat();
		try {
		ansm05Flat2 = m05Flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][4]=ansm05Flat2.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm05ayRC2 = new MatrixArrayRC();
		try {
		ansm05ayRC2 = m05ayRC.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][4]=ansm05ayRC2.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm05ayCR2 = new MatrixArrayCR();
		try {
		ansm05ayCR2 = m05ayCR.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][4]=ansm05ayCR2.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm06flat2 = new Matrix3x3flat();
		try {
		ansm06flat2 = m06flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][5]=ansm06flat2.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm06x3rc2 = new Matrix3x3rc();
		try {
		ansm06x3rc2 = m06x3rc.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][5]=ansm06x3rc2.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm06x3cr2 = new Matrix3x3cr();
		try {
		ansm06x3cr2 = m06x3cr.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][5]=ansm06x3cr2.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm06Flat2 = new MatrixArrayFlat();
		try {
		ansm06Flat2 = m06Flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][5]=ansm06Flat2.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm06ayRC2 = new MatrixArrayRC();
		try {
		ansm06ayRC2 = m06ayRC.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][5]=ansm06ayRC2.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm06ayCR2 = new MatrixArrayCR();
		try {
		ansm06ayCR2 = m06ayCR.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][5]=ansm06ayCR2.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm07flat2 = new Matrix3x3flat();
		try {
		ansm07flat2 = m07flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][6]=ansm07flat2.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm07x3rc2 = new Matrix3x3rc();
		try {
		ansm07x3rc2 = m07x3rc.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][6]=ansm07x3rc2.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm07x3cr2 = new Matrix3x3cr();
		try {
		ansm07x3cr2 = m07x3cr.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][6]=ansm07x3cr2.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm07Flat2 = new MatrixArrayFlat();
		try {
		ansm07Flat2 = m07Flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][6]=ansm07Flat2.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm07ayRC2 = new MatrixArrayRC();
		try {
		ansm07ayRC2 = m07ayRC.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][6]=ansm07ayRC2.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm07ayCR2 = new MatrixArrayCR();
		try {
		ansm07ayCR2 = m07ayCR.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][6]=ansm07ayCR2.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm08flat2 = new Matrix3x3flat();
		try {
		ansm08flat2 = m08flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][7]=ansm08flat2.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm08x3rc2 = new Matrix3x3rc();
		try {
		ansm08x3rc2 = m08x3rc.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][7]=ansm08x3rc2.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm08x3cr2 = new Matrix3x3cr();
		try {
		ansm08x3cr2 = m08x3cr.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][7]=ansm08x3cr2.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm08Flat2 = new MatrixArrayFlat();
		try {
		ansm08Flat2 = m08Flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][7]=ansm08Flat2.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm08ayRC2 = new MatrixArrayRC();
		try {
		ansm08ayRC2 = m08ayRC.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][7]=ansm08ayRC2.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm08ayCR2 = new MatrixArrayCR();
		try {
		ansm08ayCR2 = m08ayCR.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][7]=ansm08ayCR2.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm09flat2 = new Matrix3x3flat();
		try {
		ansm09flat2 = m09flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][8]=ansm09flat2.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm09x3rc2 = new Matrix3x3rc();
		try {
		ansm09x3rc2 = m09x3rc.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][8]=ansm09x3rc2.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm09x3cr2 = new Matrix3x3cr();
		try {
		ansm09x3cr2 = m09x3cr.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][8]=ansm09x3cr2.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm09Flat2 = new MatrixArrayFlat();
		try {
		ansm09Flat2 = m09Flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][8]=ansm09Flat2.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm09ayRC2 = new MatrixArrayRC();
		try {
		ansm09ayRC2 = m09ayRC.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][8]=ansm09ayRC2.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm09ayCR2 = new MatrixArrayCR();
		try {
		ansm09ayCR2 = m09ayCR.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][8]=ansm09ayCR2.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm10flat2 = new Matrix3x3flat();
		try {
		ansm10flat2 = m10flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][9]=ansm10flat2.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm10x3rc2 = new Matrix3x3rc();
		try {
		ansm10x3rc2 = m10x3rc.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][9]=ansm10x3rc2.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm10x3cr2 = new Matrix3x3cr();
		try {
		ansm10x3cr2 = m10x3cr.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][9]=ansm10x3cr2.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm10Flat2 = new MatrixArrayFlat();
		try {
		ansm10Flat2 = m10Flat.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][9]=ansm10Flat2.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm10ayRC2 = new MatrixArrayRC();
		try {
		ansm10ayRC2 = m10ayRC.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][9]=ansm10ayRC2.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm10ayCR2 = new MatrixArrayCR();
		try {
		ansm10ayCR2 = m10ayCR.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[3][9]=ansm10ayCR2.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm01flat3 = new Matrix3x3flat();
		try {
		ansm01flat3 = m01flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][0]=ansm01flat3.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm01x3rc3 = new Matrix3x3rc();
		try {
		ansm01x3rc3 = m01x3rc.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][0]=ansm01x3rc3.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm01x3cr3 = new Matrix3x3cr();
		try {
		ansm01x3cr3 = m01x3cr.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][0]=ansm01x3cr3.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm01Flat3 = new MatrixArrayFlat();
		try {
		ansm01Flat3 = m01Flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][0]=ansm01Flat3.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm01ayRC3 = new MatrixArrayRC();
		try {
		ansm01ayRC3 = m01ayRC.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][0]=ansm01ayRC3.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm01ayCR3 = new MatrixArrayCR();
		try {
		ansm01ayCR3 = m01ayCR.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][0]=ansm01ayCR3.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm02flat3 = new Matrix3x3flat();
		try {
		ansm02flat3 = m02flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][1]=ansm02flat3.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm02x3rc3 = new Matrix3x3rc();
		try {
		ansm02x3rc3 = m02x3rc.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][1]=ansm02x3rc3.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm02x3cr3 = new Matrix3x3cr();
		try {
		ansm02x3cr3 = m02x3cr.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][1]=ansm02x3cr3.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm02Flat3 = new MatrixArrayFlat();
		try {
		ansm02Flat3 = m02Flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][1]=ansm02Flat3.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm02ayRC3 = new MatrixArrayRC();
		try {
		ansm02ayRC3 = m02ayRC.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][1]=ansm02ayRC3.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm02ayCR3 = new MatrixArrayCR();
		try {
		ansm02ayCR3 = m02ayCR.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][1]=ansm02ayCR3.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm03flat3 = new Matrix3x3flat();
		try {
		ansm03flat3 = m03flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][2]=ansm03flat3.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm03x3rc3 = new Matrix3x3rc();
		try {
		ansm03x3rc3 = m03x3rc.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][2]=ansm03x3rc3.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm03x3cr3 = new Matrix3x3cr();
		try {
		ansm03x3cr3 = m03x3cr.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][2]=ansm03x3cr3.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm03Flat3 = new MatrixArrayFlat();
		try {
		ansm03Flat3 = m03Flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][2]=ansm03Flat3.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm03ayRC3 = new MatrixArrayRC();
		try {
		ansm03ayRC3 = m03ayRC.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][2]=ansm03ayRC3.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm03ayCR3 = new MatrixArrayCR();
		try {
		ansm03ayCR3 = m03ayCR.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][2]=ansm03ayCR3.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm04flat3 = new Matrix3x3flat();
		try {
		ansm04flat3 = m04flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][3]=ansm04flat3.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm04x3rc3 = new Matrix3x3rc();
		try {
		ansm04x3rc3 = m04x3rc.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][3]=ansm04x3rc3.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm04x3cr3 = new Matrix3x3cr();
		try {
		ansm04x3cr3 = m04x3cr.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][3]=ansm04x3cr3.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm04Flat3 = new MatrixArrayFlat();
		try {
		ansm04Flat3 = m04Flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][3]=ansm04Flat3.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm04ayRC3 = new MatrixArrayRC();
		try {
		ansm04ayRC3 = m04ayRC.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][3]=ansm04ayRC3.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm04ayCR3 = new MatrixArrayCR();
		try {
		ansm04ayCR3 = m04ayCR.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][3]=ansm04ayCR3.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm05flat3 = new Matrix3x3flat();
		try {
		ansm05flat3 = m05flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][4]=ansm05flat3.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm05x3rc3 = new Matrix3x3rc();
		try {
		ansm05x3rc3 = m05x3rc.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][4]=ansm05x3rc3.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm05x3cr3 = new Matrix3x3cr();
		try {
		ansm05x3cr3 = m05x3cr.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][4]=ansm05x3cr3.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm05Flat3 = new MatrixArrayFlat();
		try {
		ansm05Flat3 = m05Flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][4]=ansm05Flat3.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm05ayRC3 = new MatrixArrayRC();
		try {
		ansm05ayRC3 = m05ayRC.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][4]=ansm05ayRC3.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm05ayCR3 = new MatrixArrayCR();
		try {
		ansm05ayCR3 = m05ayCR.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][4]=ansm05ayCR3.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm06flat3 = new Matrix3x3flat();
		try {
		ansm06flat3 = m06flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][5]=ansm06flat3.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm06x3rc3 = new Matrix3x3rc();
		try {
		ansm06x3rc3 = m06x3rc.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][5]=ansm06x3rc3.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm06x3cr3 = new Matrix3x3cr();
		try {
		ansm06x3cr3 = m06x3cr.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][5]=ansm06x3cr3.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm06Flat3 = new MatrixArrayFlat();
		try {
		ansm06Flat3 = m06Flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][5]=ansm06Flat3.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm06ayRC3 = new MatrixArrayRC();
		try {
		ansm06ayRC3 = m06ayRC.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][5]=ansm06ayRC3.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm06ayCR3 = new MatrixArrayCR();
		try {
		ansm06ayCR3 = m06ayCR.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][5]=ansm06ayCR3.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm07flat3 = new Matrix3x3flat();
		try {
		ansm07flat3 = m07flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][6]=ansm07flat3.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm07x3rc3 = new Matrix3x3rc();
		try {
		ansm07x3rc3 = m07x3rc.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][6]=ansm07x3rc3.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm07x3cr3 = new Matrix3x3cr();
		try {
		ansm07x3cr3 = m07x3cr.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][6]=ansm07x3cr3.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm07Flat3 = new MatrixArrayFlat();
		try {
		ansm07Flat3 = m07Flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][6]=ansm07Flat3.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm07ayRC3 = new MatrixArrayRC();
		try {
		ansm07ayRC3 = m07ayRC.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][6]=ansm07ayRC3.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm07ayCR3 = new MatrixArrayCR();
		try {
		ansm07ayCR3 = m07ayCR.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][6]=ansm07ayCR3.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm08flat3 = new Matrix3x3flat();
		try {
		ansm08flat3 = m08flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][7]=ansm08flat3.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm08x3rc3 = new Matrix3x3rc();
		try {
		ansm08x3rc3 = m08x3rc.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][7]=ansm08x3rc3.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm08x3cr3 = new Matrix3x3cr();
		try {
		ansm08x3cr3 = m08x3cr.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][7]=ansm08x3cr3.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm08Flat3 = new MatrixArrayFlat();
		try {
		ansm08Flat3 = m08Flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][7]=ansm08Flat3.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm08ayRC3 = new MatrixArrayRC();
		try {
		ansm08ayRC3 = m08ayRC.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][7]=ansm08ayRC3.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm08ayCR3 = new MatrixArrayCR();
		try {
		ansm08ayCR3 = m08ayCR.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][7]=ansm08ayCR3.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm09flat3 = new Matrix3x3flat();
		try {
		ansm09flat3 = m09flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][8]=ansm09flat3.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm09x3rc3 = new Matrix3x3rc();
		try {
		ansm09x3rc3 = m09x3rc.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][8]=ansm09x3rc3.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm09x3cr3 = new Matrix3x3cr();
		try {
		ansm09x3cr3 = m09x3cr.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][8]=ansm09x3cr3.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm09Flat3 = new MatrixArrayFlat();
		try {
		ansm09Flat3 = m09Flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][8]=ansm09Flat3.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm09ayRC3 = new MatrixArrayRC();
		try {
		ansm09ayRC3 = m09ayRC.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][8]=ansm09ayRC3.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm09ayCR3 = new MatrixArrayCR();
		try {
		ansm09ayCR3 = m09ayCR.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][8]=ansm09ayCR3.toArray();
		//matrixpower(i)
		Matrix3x3flat ansm10flat3 = new Matrix3x3flat();
		try {
		ansm10flat3 = m10flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][9]=ansm10flat3.toArray();
		//matrixpower(i)
		Matrix3x3rc ansm10x3rc3 = new Matrix3x3rc();
		try {
		ansm10x3rc3 = m10x3rc.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][9]=ansm10x3rc3.toArray();
		//matrixpower(i)
		Matrix3x3cr ansm10x3cr3 = new Matrix3x3cr();
		try {
		ansm10x3cr3 = m10x3cr.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][9]=ansm10x3cr3.toArray();
		//matrixpower(i)
		MatrixArrayFlat ansm10Flat3 = new MatrixArrayFlat();
		try {
		ansm10Flat3 = m10Flat.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][9]=ansm10Flat3.toArray();
		//matrixpower(i)
		MatrixArrayRC ansm10ayRC3 = new MatrixArrayRC();
		try {
		ansm10ayRC3 = m10ayRC.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][9]=ansm10ayRC3.toArray();
		//matrixpower(i)
		MatrixArrayCR ansm10ayCR3 = new MatrixArrayCR();
		try {
		ansm10ayCR3 = m10ayCR.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		content[4][9]=ansm10ayCR3.toArray();
		
		//verify answer
		assertArrayEquals(content[0][0],ansm01flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][0],ansm01x3rcneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][0],ansm01x3crneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][0],ansm01Flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][0],ansm01ayRCneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][0],ansm01ayCRneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][1],ansm02flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][1],ansm02x3rcneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][1],ansm02x3crneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][1],ansm02Flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][1],ansm02ayRCneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][1],ansm02ayCRneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][2],ansm03flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][2],ansm03x3rcneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][2],ansm03x3crneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][2],ansm03Flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][2],ansm03ayRCneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][2],ansm03ayCRneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][3],ansm04flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][3],ansm04x3rcneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][3],ansm04x3crneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][3],ansm04Flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][3],ansm04ayRCneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][3],ansm04ayCRneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][4],ansm05flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][4],ansm05x3rcneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][4],ansm05x3crneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][4],ansm05Flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][4],ansm05ayRCneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][4],ansm05ayCRneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][5],ansm06flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][5],ansm06x3rcneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][5],ansm06x3crneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][5],ansm06Flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][5],ansm06ayRCneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][5],ansm06ayCRneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][6],ansm07flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][6],ansm07x3rcneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][6],ansm07x3crneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][6],ansm07Flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][6],ansm07ayRCneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][6],ansm07ayCRneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][7],ansm08flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][7],ansm08x3rcneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][7],ansm08x3crneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][7],ansm08Flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][7],ansm08ayRCneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][7],ansm08ayCRneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][8],ansm09flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][8],ansm09x3rcneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][8],ansm09x3crneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][8],ansm09Flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][8],ansm09ayRCneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][8],ansm09ayCRneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][9],ansm10flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][9],ansm10x3rcneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][9],ansm10x3crneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][9],ansm10Flatneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][9],ansm10ayRCneg1.toArray());
		//verify answer
		assertArrayEquals(content[0][9],ansm10ayCRneg1.toArray());
		//verify answer
		assertArrayEquals(content[1][0],ansm01flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][0],ansm01x3rc0.toArray());
		//verify answer
		assertArrayEquals(content[1][0],ansm01x3cr0.toArray());
		//verify answer
		assertArrayEquals(content[1][0],ansm01Flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][0],ansm01ayRC0.toArray());
		//verify answer
		assertArrayEquals(content[1][0],ansm01ayCR0.toArray());
		//verify answer
		assertArrayEquals(content[1][1],ansm02flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][1],ansm02x3rc0.toArray());
		//verify answer
		assertArrayEquals(content[1][1],ansm02x3cr0.toArray());
		//verify answer
		assertArrayEquals(content[1][1],ansm02Flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][1],ansm02ayRC0.toArray());
		//verify answer
		assertArrayEquals(content[1][1],ansm02ayCR0.toArray());
		//verify answer
		assertArrayEquals(content[1][2],ansm03flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][2],ansm03x3rc0.toArray());
		//verify answer
		assertArrayEquals(content[1][2],ansm03x3cr0.toArray());
		//verify answer
		assertArrayEquals(content[1][2],ansm03Flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][2],ansm03ayRC0.toArray());
		//verify answer
		assertArrayEquals(content[1][2],ansm03ayCR0.toArray());
		//verify answer
		assertArrayEquals(content[1][3],ansm04flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][3],ansm04x3rc0.toArray());
		//verify answer
		assertArrayEquals(content[1][3],ansm04x3cr0.toArray());
		//verify answer
		assertArrayEquals(content[1][3],ansm04Flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][3],ansm04ayRC0.toArray());
		//verify answer
		assertArrayEquals(content[1][3],ansm04ayCR0.toArray());
		//verify answer
		assertArrayEquals(content[1][4],ansm05flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][4],ansm05x3rc0.toArray());
		//verify answer
		assertArrayEquals(content[1][4],ansm05x3cr0.toArray());
		//verify answer
		assertArrayEquals(content[1][4],ansm05Flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][4],ansm05ayRC0.toArray());
		//verify answer
		assertArrayEquals(content[1][4],ansm05ayCR0.toArray());
		//verify answer
		assertArrayEquals(content[1][5],ansm06flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][5],ansm06x3rc0.toArray());
		//verify answer
		assertArrayEquals(content[1][5],ansm06x3cr0.toArray());
		//verify answer
		assertArrayEquals(content[1][5],ansm06Flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][5],ansm06ayRC0.toArray());
		//verify answer
		assertArrayEquals(content[1][5],ansm06ayCR0.toArray());
		//verify answer
		assertArrayEquals(content[1][6],ansm07flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][6],ansm07x3rc0.toArray());
		//verify answer
		assertArrayEquals(content[1][6],ansm07x3cr0.toArray());
		//verify answer
		assertArrayEquals(content[1][6],ansm07Flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][6],ansm07ayRC0.toArray());
		//verify answer
		assertArrayEquals(content[1][6],ansm07ayCR0.toArray());
		//verify answer
		assertArrayEquals(content[1][7],ansm08flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][7],ansm08x3rc0.toArray());
		//verify answer
		assertArrayEquals(content[1][7],ansm08x3cr0.toArray());
		//verify answer
		assertArrayEquals(content[1][7],ansm08Flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][7],ansm08ayRC0.toArray());
		//verify answer
		assertArrayEquals(content[1][7],ansm08ayCR0.toArray());
		//verify answer
		assertArrayEquals(content[1][8],ansm09flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][8],ansm09x3rc0.toArray());
		//verify answer
		assertArrayEquals(content[1][8],ansm09x3cr0.toArray());
		//verify answer
		assertArrayEquals(content[1][8],ansm09Flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][8],ansm09ayRC0.toArray());
		//verify answer
		assertArrayEquals(content[1][8],ansm09ayCR0.toArray());
		//verify answer
		assertArrayEquals(content[1][9],ansm10flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][9],ansm10x3rc0.toArray());
		//verify answer
		assertArrayEquals(content[1][9],ansm10x3cr0.toArray());
		//verify answer
		assertArrayEquals(content[1][9],ansm10Flat0.toArray());
		//verify answer
		assertArrayEquals(content[1][9],ansm10ayRC0.toArray());
		//verify answer
		assertArrayEquals(content[1][9],ansm10ayCR0.toArray());
		//verify answer
		assertArrayEquals(content[2][0],ansm01flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][0],ansm01x3rc1.toArray());
		//verify answer
		assertArrayEquals(content[2][0],ansm01x3cr1.toArray());
		//verify answer
		assertArrayEquals(content[2][0],ansm01Flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][0],ansm01ayRC1.toArray());
		//verify answer
		assertArrayEquals(content[2][0],ansm01ayCR1.toArray());
		//verify answer
		assertArrayEquals(content[2][1],ansm02flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][1],ansm02x3rc1.toArray());
		//verify answer
		assertArrayEquals(content[2][1],ansm02x3cr1.toArray());
		//verify answer
		assertArrayEquals(content[2][1],ansm02Flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][1],ansm02ayRC1.toArray());
		//verify answer
		assertArrayEquals(content[2][1],ansm02ayCR1.toArray());
		//verify answer
		assertArrayEquals(content[2][2],ansm03flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][2],ansm03x3rc1.toArray());
		//verify answer
		assertArrayEquals(content[2][2],ansm03x3cr1.toArray());
		//verify answer
		assertArrayEquals(content[2][2],ansm03Flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][2],ansm03ayRC1.toArray());
		//verify answer
		assertArrayEquals(content[2][2],ansm03ayCR1.toArray());
		//verify answer
		assertArrayEquals(content[2][3],ansm04flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][3],ansm04x3rc1.toArray());
		//verify answer
		assertArrayEquals(content[2][3],ansm04x3cr1.toArray());
		//verify answer
		assertArrayEquals(content[2][3],ansm04Flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][3],ansm04ayRC1.toArray());
		//verify answer
		assertArrayEquals(content[2][3],ansm04ayCR1.toArray());
		//verify answer
		assertArrayEquals(content[2][4],ansm05flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][4],ansm05x3rc1.toArray());
		//verify answer
		assertArrayEquals(content[2][4],ansm05x3cr1.toArray());
		//verify answer
		assertArrayEquals(content[2][4],ansm05Flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][4],ansm05ayRC1.toArray());
		//verify answer
		assertArrayEquals(content[2][4],ansm05ayCR1.toArray());
		//verify answer
		assertArrayEquals(content[2][5],ansm06flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][5],ansm06x3rc1.toArray());
		//verify answer
		assertArrayEquals(content[2][5],ansm06x3cr1.toArray());
		//verify answer
		assertArrayEquals(content[2][5],ansm06Flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][5],ansm06ayRC1.toArray());
		//verify answer
		assertArrayEquals(content[2][5],ansm06ayCR1.toArray());
		//verify answer
		assertArrayEquals(content[2][6],ansm07flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][6],ansm07x3rc1.toArray());
		//verify answer
		assertArrayEquals(content[2][6],ansm07x3cr1.toArray());
		//verify answer
		assertArrayEquals(content[2][6],ansm07Flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][6],ansm07ayRC1.toArray());
		//verify answer
		assertArrayEquals(content[2][6],ansm07ayCR1.toArray());
		//verify answer
		assertArrayEquals(content[2][7],ansm08flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][7],ansm08x3rc1.toArray());
		//verify answer
		assertArrayEquals(content[2][7],ansm08x3cr1.toArray());
		//verify answer
		assertArrayEquals(content[2][7],ansm08Flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][7],ansm08ayRC1.toArray());
		//verify answer
		assertArrayEquals(content[2][7],ansm08ayCR1.toArray());
		//verify answer
		assertArrayEquals(content[2][8],ansm09flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][8],ansm09x3rc1.toArray());
		//verify answer
		assertArrayEquals(content[2][8],ansm09x3cr1.toArray());
		//verify answer
		assertArrayEquals(content[2][8],ansm09Flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][8],ansm09ayRC1.toArray());
		//verify answer
		assertArrayEquals(content[2][8],ansm09ayCR1.toArray());
		//verify answer
		assertArrayEquals(content[2][9],ansm10flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][9],ansm10x3rc1.toArray());
		//verify answer
		assertArrayEquals(content[2][9],ansm10x3cr1.toArray());
		//verify answer
		assertArrayEquals(content[2][9],ansm10Flat1.toArray());
		//verify answer
		assertArrayEquals(content[2][9],ansm10ayRC1.toArray());
		//verify answer
		assertArrayEquals(content[2][9],ansm10ayCR1.toArray());
		//verify answer
		assertArrayEquals(content[3][0],ansm01flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][0],ansm01x3rc2.toArray());
		//verify answer
		assertArrayEquals(content[3][0],ansm01x3cr2.toArray());
		//verify answer
		assertArrayEquals(content[3][0],ansm01Flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][0],ansm01ayRC2.toArray());
		//verify answer
		assertArrayEquals(content[3][0],ansm01ayCR2.toArray());
		//verify answer
		assertArrayEquals(content[3][1],ansm02flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][1],ansm02x3rc2.toArray());
		//verify answer
		assertArrayEquals(content[3][1],ansm02x3cr2.toArray());
		//verify answer
		assertArrayEquals(content[3][1],ansm02Flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][1],ansm02ayRC2.toArray());
		//verify answer
		assertArrayEquals(content[3][1],ansm02ayCR2.toArray());
		//verify answer
		assertArrayEquals(content[3][2],ansm03flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][2],ansm03x3rc2.toArray());
		//verify answer
		assertArrayEquals(content[3][2],ansm03x3cr2.toArray());
		//verify answer
		assertArrayEquals(content[3][2],ansm03Flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][2],ansm03ayRC2.toArray());
		//verify answer
		assertArrayEquals(content[3][2],ansm03ayCR2.toArray());
		//verify answer
		assertArrayEquals(content[3][3],ansm04flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][3],ansm04x3rc2.toArray());
		//verify answer
		assertArrayEquals(content[3][3],ansm04x3cr2.toArray());
		//verify answer
		assertArrayEquals(content[3][3],ansm04Flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][3],ansm04ayRC2.toArray());
		//verify answer
		assertArrayEquals(content[3][3],ansm04ayCR2.toArray());
		//verify answer
		assertArrayEquals(content[3][4],ansm05flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][4],ansm05x3rc2.toArray());
		//verify answer
		assertArrayEquals(content[3][4],ansm05x3cr2.toArray());
		//verify answer
		assertArrayEquals(content[3][4],ansm05Flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][4],ansm05ayRC2.toArray());
		//verify answer
		assertArrayEquals(content[3][4],ansm05ayCR2.toArray());
		//verify answer
		assertArrayEquals(content[3][5],ansm06flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][5],ansm06x3rc2.toArray());
		//verify answer
		assertArrayEquals(content[3][5],ansm06x3cr2.toArray());
		//verify answer
		assertArrayEquals(content[3][5],ansm06Flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][5],ansm06ayRC2.toArray());
		//verify answer
		assertArrayEquals(content[3][5],ansm06ayCR2.toArray());
		//verify answer
		assertArrayEquals(content[3][6],ansm07flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][6],ansm07x3rc2.toArray());
		//verify answer
		assertArrayEquals(content[3][6],ansm07x3cr2.toArray());
		//verify answer
		assertArrayEquals(content[3][6],ansm07Flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][6],ansm07ayRC2.toArray());
		//verify answer
		assertArrayEquals(content[3][6],ansm07ayCR2.toArray());
		//verify answer
		assertArrayEquals(content[3][7],ansm08flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][7],ansm08x3rc2.toArray());
		//verify answer
		assertArrayEquals(content[3][7],ansm08x3cr2.toArray());
		//verify answer
		assertArrayEquals(content[3][7],ansm08Flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][7],ansm08ayRC2.toArray());
		//verify answer
		assertArrayEquals(content[3][7],ansm08ayCR2.toArray());
		//verify answer
		assertArrayEquals(content[3][8],ansm09flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][8],ansm09x3rc2.toArray());
		//verify answer
		assertArrayEquals(content[3][8],ansm09x3cr2.toArray());
		//verify answer
		assertArrayEquals(content[3][8],ansm09Flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][8],ansm09ayRC2.toArray());
		//verify answer
		assertArrayEquals(content[3][8],ansm09ayCR2.toArray());
		//verify answer
		assertArrayEquals(content[3][9],ansm10flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][9],ansm10x3rc2.toArray());
		//verify answer
		assertArrayEquals(content[3][9],ansm10x3cr2.toArray());
		//verify answer
		assertArrayEquals(content[3][9],ansm10Flat2.toArray());
		//verify answer
		assertArrayEquals(content[3][9],ansm10ayRC2.toArray());
		//verify answer
		assertArrayEquals(content[3][9],ansm10ayCR2.toArray());
		//verify answer
		assertArrayEquals(content[4][0],ansm01flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][0],ansm01x3rc3.toArray());
		//verify answer
		assertArrayEquals(content[4][0],ansm01x3cr3.toArray());
		//verify answer
		assertArrayEquals(content[4][0],ansm01Flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][0],ansm01ayRC3.toArray());
		//verify answer
		assertArrayEquals(content[4][0],ansm01ayCR3.toArray());
		//verify answer
		assertArrayEquals(content[4][1],ansm02flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][1],ansm02x3rc3.toArray());
		//verify answer
		assertArrayEquals(content[4][1],ansm02x3cr3.toArray());
		//verify answer
		assertArrayEquals(content[4][1],ansm02Flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][1],ansm02ayRC3.toArray());
		//verify answer
		assertArrayEquals(content[4][1],ansm02ayCR3.toArray());
		//verify answer
		assertArrayEquals(content[4][2],ansm03flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][2],ansm03x3rc3.toArray());
		//verify answer
		assertArrayEquals(content[4][2],ansm03x3cr3.toArray());
		//verify answer
		assertArrayEquals(content[4][2],ansm03Flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][2],ansm03ayRC3.toArray());
		//verify answer
		assertArrayEquals(content[4][2],ansm03ayCR3.toArray());
		//verify answer
		assertArrayEquals(content[4][3],ansm04flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][3],ansm04x3rc3.toArray());
		//verify answer
		assertArrayEquals(content[4][3],ansm04x3cr3.toArray());
		//verify answer
		assertArrayEquals(content[4][3],ansm04Flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][3],ansm04ayRC3.toArray());
		//verify answer
		assertArrayEquals(content[4][3],ansm04ayCR3.toArray());
		//verify answer
		assertArrayEquals(content[4][4],ansm05flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][4],ansm05x3rc3.toArray());
		//verify answer
		assertArrayEquals(content[4][4],ansm05x3cr3.toArray());
		//verify answer
		assertArrayEquals(content[4][4],ansm05Flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][4],ansm05ayRC3.toArray());
		//verify answer
		assertArrayEquals(content[4][4],ansm05ayCR3.toArray());
		//verify answer
		assertArrayEquals(content[4][5],ansm06flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][5],ansm06x3rc3.toArray());
		//verify answer
		assertArrayEquals(content[4][5],ansm06x3cr3.toArray());
		//verify answer
		assertArrayEquals(content[4][5],ansm06Flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][5],ansm06ayRC3.toArray());
		//verify answer
		assertArrayEquals(content[4][5],ansm06ayCR3.toArray());
		//verify answer
		assertArrayEquals(content[4][6],ansm07flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][6],ansm07x3rc3.toArray());
		//verify answer
		assertArrayEquals(content[4][6],ansm07x3cr3.toArray());
		//verify answer
		assertArrayEquals(content[4][6],ansm07Flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][6],ansm07ayRC3.toArray());
		//verify answer
		assertArrayEquals(content[4][6],ansm07ayCR3.toArray());
		//verify answer
		assertArrayEquals(content[4][7],ansm08flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][7],ansm08x3rc3.toArray());
		//verify answer
		assertArrayEquals(content[4][7],ansm08x3cr3.toArray());
		//verify answer
		assertArrayEquals(content[4][7],ansm08Flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][7],ansm08ayRC3.toArray());
		//verify answer
		assertArrayEquals(content[4][7],ansm08ayCR3.toArray());
		//verify answer
		assertArrayEquals(content[4][8],ansm09flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][8],ansm09x3rc3.toArray());
		//verify answer
		assertArrayEquals(content[4][8],ansm09x3cr3.toArray());
		//verify answer
		assertArrayEquals(content[4][8],ansm09Flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][8],ansm09ayRC3.toArray());
		//verify answer
		assertArrayEquals(content[4][8],ansm09ayCR3.toArray());
		//verify answer
		assertArrayEquals(content[4][9],ansm10flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][9],ansm10x3rc3.toArray());
		//verify answer
		assertArrayEquals(content[4][9],ansm10x3cr3.toArray());
		//verify answer
		assertArrayEquals(content[4][9],ansm10Flat3.toArray());
		//verify answer
		assertArrayEquals(content[4][9],ansm10ayRC3.toArray());
		//verify answer
		assertArrayEquals(content[4][9],ansm10ayCR3.toArray());
		
		//check c.toArray() = d.toArray()
		Matrix3x3flat a000neg1 = new Matrix3x3flat();
		Matrix3x3flat c000neg1 = new Matrix3x3flat();
		Matrix3x3flat b000neg1 = new Matrix3x3flat();
		Matrix3x3flat d000neg1 = new Matrix3x3flat();
		try {
		a000neg1 = new Matrix3x3flat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b000neg1 = new Matrix3x3flat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c000neg1 = a000neg1.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d000neg1 = b000neg1.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c000neg1.toArray(),d000neg1.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0000 = new Matrix3x3flat();
		Matrix3x3flat c0000 = new Matrix3x3flat();
		Matrix3x3flat b0000 = new Matrix3x3flat();
		Matrix3x3flat d0000 = new Matrix3x3flat();
		try {
		a0000 = new Matrix3x3flat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0000 = new Matrix3x3flat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0000 = a0000.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0000 = b0000.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0000.toArray(),d0000.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0001 = new Matrix3x3flat();
		Matrix3x3flat c0001 = new Matrix3x3flat();
		Matrix3x3flat b0001 = new Matrix3x3flat();
		Matrix3x3flat d0001 = new Matrix3x3flat();
		try {
		a0001 = new Matrix3x3flat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0001 = new Matrix3x3flat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0001 = a0001.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0001 = b0001.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0001.toArray(),d0001.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0002 = new Matrix3x3flat();
		Matrix3x3flat c0002 = new Matrix3x3flat();
		Matrix3x3flat b0002 = new Matrix3x3flat();
		Matrix3x3flat d0002 = new Matrix3x3flat();
		try {
		a0002 = new Matrix3x3flat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0002 = new Matrix3x3flat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0002 = a0002.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0002 = b0002.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0002.toArray(),d0002.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0003 = new Matrix3x3flat();
		Matrix3x3flat c0003 = new Matrix3x3flat();
		Matrix3x3flat b0003 = new Matrix3x3flat();
		Matrix3x3flat d0003 = new Matrix3x3flat();
		try {
		a0003 = new Matrix3x3flat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0003 = new Matrix3x3flat(m01);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0003 = a0003.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0003 = b0003.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0003.toArray(),d0003.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a001neg1 = new Matrix3x3flat();
		Matrix3x3flat c001neg1 = new Matrix3x3flat();
		Matrix3x3flat b001neg1 = new Matrix3x3flat();
		Matrix3x3flat d001neg1 = new Matrix3x3flat();
		try {
		a001neg1 = new Matrix3x3flat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b001neg1 = new Matrix3x3flat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c001neg1 = a001neg1.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d001neg1 = b001neg1.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c001neg1.toArray(),d001neg1.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0010 = new Matrix3x3flat();
		Matrix3x3flat c0010 = new Matrix3x3flat();
		Matrix3x3flat b0010 = new Matrix3x3flat();
		Matrix3x3flat d0010 = new Matrix3x3flat();
		try {
		a0010 = new Matrix3x3flat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0010 = new Matrix3x3flat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0010 = a0010.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0010 = b0010.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0010.toArray(),d0010.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0011 = new Matrix3x3flat();
		Matrix3x3flat c0011 = new Matrix3x3flat();
		Matrix3x3flat b0011 = new Matrix3x3flat();
		Matrix3x3flat d0011 = new Matrix3x3flat();
		try {
		a0011 = new Matrix3x3flat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0011 = new Matrix3x3flat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0011 = a0011.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0011 = b0011.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0011.toArray(),d0011.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0012 = new Matrix3x3flat();
		Matrix3x3flat c0012 = new Matrix3x3flat();
		Matrix3x3flat b0012 = new Matrix3x3flat();
		Matrix3x3flat d0012 = new Matrix3x3flat();
		try {
		a0012 = new Matrix3x3flat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0012 = new Matrix3x3flat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0012 = a0012.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0012 = b0012.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0012.toArray(),d0012.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0013 = new Matrix3x3flat();
		Matrix3x3flat c0013 = new Matrix3x3flat();
		Matrix3x3flat b0013 = new Matrix3x3flat();
		Matrix3x3flat d0013 = new Matrix3x3flat();
		try {
		a0013 = new Matrix3x3flat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0013 = new Matrix3x3flat(m02);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0013 = a0013.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0013 = b0013.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0013.toArray(),d0013.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a002neg1 = new Matrix3x3flat();
		Matrix3x3flat c002neg1 = new Matrix3x3flat();
		Matrix3x3flat b002neg1 = new Matrix3x3flat();
		Matrix3x3flat d002neg1 = new Matrix3x3flat();
		try {
		a002neg1 = new Matrix3x3flat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b002neg1 = new Matrix3x3flat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c002neg1 = a002neg1.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d002neg1 = b002neg1.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c002neg1.toArray(),d002neg1.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0020 = new Matrix3x3flat();
		Matrix3x3flat c0020 = new Matrix3x3flat();
		Matrix3x3flat b0020 = new Matrix3x3flat();
		Matrix3x3flat d0020 = new Matrix3x3flat();
		try {
		a0020 = new Matrix3x3flat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0020 = new Matrix3x3flat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0020 = a0020.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0020 = b0020.matrixpower(0);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0020.toArray(),d0020.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0021 = new Matrix3x3flat();
		Matrix3x3flat c0021 = new Matrix3x3flat();
		Matrix3x3flat b0021 = new Matrix3x3flat();
		Matrix3x3flat d0021 = new Matrix3x3flat();
		try {
		a0021 = new Matrix3x3flat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0021 = new Matrix3x3flat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0021 = a0021.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0021 = b0021.matrixpower(1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0021.toArray(),d0021.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0022 = new Matrix3x3flat();
		Matrix3x3flat c0022 = new Matrix3x3flat();
		Matrix3x3flat b0022 = new Matrix3x3flat();
		Matrix3x3flat d0022 = new Matrix3x3flat();
		try {
		a0022 = new Matrix3x3flat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0022 = new Matrix3x3flat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0022 = a0022.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0022 = b0022.matrixpower(2);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0022.toArray(),d0022.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a0023 = new Matrix3x3flat();
		Matrix3x3flat c0023 = new Matrix3x3flat();
		Matrix3x3flat b0023 = new Matrix3x3flat();
		Matrix3x3flat d0023 = new Matrix3x3flat();
		try {
		a0023 = new Matrix3x3flat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b0023 = new Matrix3x3flat(m03);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c0023 = a0023.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d0023 = b0023.matrixpower(3);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c0023.toArray(),d0023.toArray());
		//check c.toArray() = d.toArray()
		Matrix3x3flat a003neg1 = new Matrix3x3flat();
		Matrix3x3flat c003neg1 = new Matrix3x3flat();
		Matrix3x3flat b003neg1 = new Matrix3x3flat();
		Matrix3x3flat d003neg1 = new Matrix3x3flat();
		try {
		a003neg1 = new Matrix3x3flat(m04);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		b003neg1 = new Matrix3x3flat(m04);
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		c003neg1 = a003neg1.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		try {
		d003neg1 = b003neg1.matrixpower(-1);
		} catch (WrongPower e) {
		System.out.println(e.FormatError());
		} catch (WrongLength e) {
		System.out.println(e.FormatError());
		}
		assertArrayEquals(c003neg1.toArray(),d003neg1.toArray());

		/*rest of the code is stored at test2.txt
		 *compiler said the test class exceed the bytes limit
		 *
		 *the automation of the code is also attached
		 *auto.py  -- generates 60 class instances
		 *test1.py -- raising 60 instances to the power of -1,0,1,2,3
		 *         -- store the result in the array content
		 *         -- ie. content[0][0] = matrix m01 to the power of -1
		 *verify.py -- verify the result in content matches the result
		 *test2.py -- generates 6*6*10*5 test cases
		 */

	}

}
