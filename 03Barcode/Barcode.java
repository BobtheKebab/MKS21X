import java.lang.RuntimeException;

public class Barcode implements Comparable<Barcode> {

    private String zip;
    private int checkDigit;

    String[] codes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", 
		      ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};

    public Barcode (String zip) {
	if (zip.length() != 5) throw new RuntimeException();
	this.zip = zip;
	checkDigit = checkSum() % 10;
    }

    public Barcode clone () {
	Barcode mustReturn = new Barcode(zip);
	return mustReturn;
    }

    public String toString () {
	String mustReturn = "|";
	mustReturn += makeBarcode();
	mustReturn += codes[checkDigit];
	mustReturn += "|";
	return mustReturn;
    }

    public String toZip (String code) {
	String mustReturn = "";
	if (code.length() != 32) throw new RuntimeException("Given code is wrong length");
	if ( (code.charAt(0) != '|') && (code.charAt(31) != '|') ) throw new RuntimeException("Start/end bars are missing");
        for (int strIndex = 1; strIndex + 5 < code.length(); strIndex += 5) {
	    
	
    public int compareTo (Barcode other) {
	String barCode = zip + checkDigit;
	String otherBarCode = other.zip + other.checkDigit;
	return barCode.compareTo(otherBarCode);
    }

    private int[] makeZipArray () {
	int[] mustReturn = new int[5];
	for (int count = 0; count < 5; count++) {
	    if (zip.charAt(count) > 57) throw new RuntimeException();
	    mustReturn[count] = zip.charAt(count) - 48;
	}
	return mustReturn;
    }	    
	
    private String makeBarcode () {
	String mustReturn = "";
        int[] arrayZip = makeZipArray();
	for (int num : arrayZip) {
	    mustReturn += codes[num];
	}
	return mustReturn;
    }

    private int checkSum () {
	int mustReturn = 0;
	int[] arrayZip = makeZipArray();
	for (int num : arrayZip) {
	    mustReturn += num;
	}
	return mustReturn;
    }

}
