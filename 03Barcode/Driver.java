public class Driver {
    public static void main (String[] args) {

	String[] codes = {"abc", "def", "ghi"};
	
	Barcode a = new Barcode("08451");

	//System.out.println(Barcode.codeToNum("||:::"));
	System.out.println(Barcode.toZip("|||:::|::|::|::|:|:|::::||||:::|"));

    }
}
