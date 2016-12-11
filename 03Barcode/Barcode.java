import java.lang.RuntimeException;

public class Barcode implements Comparable<Barcode> {

    private String _zip;
    private int _checkDigit;

    String[] codes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", 
		      ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};

    public Barcode (String zip) {
	if (zip.length() != 5) throw new RuntimeException();
	_zip = zip;
	_checkDigit = checkSum();
    }

    public String toString () {
	return _zip + _checkDigit + " " + toCode(_zip);
    }


    public String toCode (String zip) {
	String mustReturn = "|";
	mustReturn += makeBarcode(zip);
	mustReturn += codes[_checkDigit];
	mustReturn += "|";
	return mustReturn;
    }

    public static String toZip (String code) {
	String mustReturn = "";
	
	if (code.length() != 32) throw new RuntimeException("Given barcode is wrong length");
	if ( (code.charAt(0) != '|') && (code.charAt(31) != '|') ) throw new RuntimeException("Start/end bars are missing");

	// check for illegal characters
	for (char character : code.toCharArray()) {
	    if ( (character != ':') && (character != '|') ) throw new RuntimeException("Barcode contains illegal characters");
	}

	// Puts code into list of single number codes
	String[] codeArray = new String[6];
	for (int index = 1, count = 0; index + 5 < 31; index += 5, count++) {
	    codeArray[count] = code.substring(index, index + 5);
	}

	for (String element : codeArray) mustReturn += codeToNum(element);

        return mustReturn;
    }
	
    public int compareTo (Barcode other) {
	String barCode = _zip + _checkDigit;
	String otherBarCode = other._zip + other._checkDigit;
	return barCode.compareTo(otherBarCode);
    }

    private int[] makeZipArray (String zip) {
	int[] mustReturn = new int[5];
	for (int count = 0; count < 5; count++) {
	    if (zip.charAt(count) > 57) throw new RuntimeException();
	    mustReturn[count] = zip.charAt(count) - 48;
	}
	return mustReturn;
    }	    
	
    private String makeBarcode (String zip) {
	String mustReturn = "";
        int[] arrayZip = makeZipArray(zip);
	for (int num : arrayZip) {
	    mustReturn += codes[num];
	}
	return mustReturn;
    }

    private static int codeToNum (String code) {
	
	String[] codes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", 
			  ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
	
	for (int index = 0; index < codes.length; index++) {
	    if (code == codes[index]) return index;
	}
	throw new RuntimeException("Barcode contains invalid values");
    }
		

    private int checkSum () {
	int mustReturn = 0;
	int[] arrayZip = makeZipArray(_zip);
	for (int num : arrayZip) {
	    mustReturn += num;
	}
	mustReturn = mustReturn % 10;
	return mustReturn;
    }

}
