public class Barcode implements Comparable<Barcode> {

    private String zip;
    private int checkDigit;

    String[] codes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", 
		      ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};

    public Barcode (String zip) {
	this.zip = zip;
	checkDigit = checkSum() % 2;
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

    private int[] makeZipArray () {
	int[] mustReturn = new int[5];
	for (int count = 0; count < 5; count++) {
	    mustReturn[count] = zip.charAt(count);
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
