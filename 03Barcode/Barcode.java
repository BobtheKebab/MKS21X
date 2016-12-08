public class Barcode implements Comparable<Barcode> {

    private String zip;
    private int checkDigit;

    String[] codes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", 
		      ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};

    public Barcode (String zip) {
	this.zip = zip;
	checkDigit = checkSum() % 2;
    }

    private int[] makeZipArray () {
	int[] answer = new int[5];
	for (int count = 0; count < 5; count++) {
	    answer[count] = zip.charAt(count);
	}
    }	    
	
    private String makeBarcode () {
	String answer = "";
        int[] arrayZip = makeZipArray();
	for (int num : arrayZip) {
	    answer += codes[num];
	}
	return answer;
    }

    private int checkSum () {
	int answer = 0;
	int[] arrayZip = makeZipArray();
	for (int num : arrayZip) {
	    answer += num;
	}
	return answer;
    }

}
