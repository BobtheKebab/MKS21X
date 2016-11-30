public class ReferenceBook extends LibraryBook {

    private String collection;

    public ReferenceBook (String authorName, String titleName, String ISBNnum, String callNum, String collect) {
	super(authorName, titleName, ISBNnum, callNum);
	setCollection(collect);
    }

    public String getCollection () {
	return collection;
    }

    public void setCollection (String collect) {
	collection = collect;
    }

    public void checkout (String patron, String due) {
	System.out.println("Cannot check out a reference book");
    }

    public void returned () {
	System.out.println("Reference book could not have been checked out, returning is impossible");
    }

    public String circulationStatus () {
	return "Non-circulating reference book";
    }

    public String toString () {
	String answer = super.toString();
	answer += "Collection: " + getCollection() + "\n";
	return answer;
    }

}
