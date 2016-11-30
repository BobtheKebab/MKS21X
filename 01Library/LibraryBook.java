abstract Class LibraryBook extends Book, implements Comparable<LibraryBook> {

    private String callNumber;

    public LibraryBook (string authorName, string titleName, string ISBNnum, string callNum) {
	super.Book(authorName, titleName, ISBNnum);
	setCallNum(callNum);
    }

    public String getCallNum () {
	return callNumber;
    }

    public void setCallNum (callNum) {
	callNumber = callNum;
    }

    abstract void checkout (String patron, String due);
    abstract void returned ();
    abstract String circulationStatus ();

    public int compareTo (LibraryBook otherBook) {
	
    }

    public String toString () {
	String answer = "";
	answer += "Title: " + getTitle() + "\n";
	answer += "Author: " + getAuthor() + "\n";
	answer += "ISBN: " + getISBN() + "\n";
	answer += "Call Number: " + getCallNum() + "\n";
	answer += circulationStatus();
    }
