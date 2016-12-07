public class Barcode implements Comparable<Barcode> {

    private String zip;
    private int checkDigit;

    String[] codes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", 
		      ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};

    public Barcode (String zip) {
	this.zip = zip;
	for (String num : zip) {
	    checkDigit += Integer.parseInt(num);
	}
	checkDigit %= 2;
    }
	
    
    public String toString () {
	return "dank";
    

}
