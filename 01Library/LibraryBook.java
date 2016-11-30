abstract class LibraryBook extends Book implements Comparable<LibraryBook> {

    private String callNumber;

    public LibraryBook (String authorName, String titleName, String ISBNnum, String callNum) {
	super(authorName, titleName, ISBNnum);
	setCallNum(callNum);
    }

    public String getCallNum () {
	return callNumber;
    }

    public void setCallNum (String callNum) {
	callNumber = callNum;
    }

    abstract void checkout (String patron, String due);
    abstract void returned ();
    abstract String circulationStatus ();

    public int compareTo (LibraryBook otherBook) {
	String book1 = getCallNum(), book2 = otherBook.getCallNum();
	return book1.compareTo(book2);
    }

    public String toString () {
	String answer = super.toString();
	answer += "Call Number: " + getCallNum() + "\n";
	answer += circulationStatus() + "\n";
	return answer;
    }

}
