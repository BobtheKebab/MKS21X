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
	
    public int compareTo (Barcode other) {
	int mustReturn = 0;
	String barCode = zip + checkDigit;
	String otherBarCode = other.zip + other.checkDigit;
	for (int count = 0; count < 5; count ++) {
	    String charOrig = "" + barCode.charAt(count);
	    String charOther = "" + otherBarCode.charAt(count);
	    mustReturn += charOrig.compareTo(charOther);
	}
	return mustReturn;
    }

    public int[] makeZipArray () {
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

    public static void main (String[] args) {

	Barcode a = new Barcode("12345");
	System.out.println(a.toString());

    }

}
