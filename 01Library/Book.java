public class Book {

    private String author, title, ISBN;

    public Book () {
	setAuthor("J. R. R. Tolkien");
	setTitle("Lord of the Rings");
	setISBN("6666666666");
    }

    public Book (String authorName, String titleName, String ISBNnum) {
	setAuthor(authorName);
	setTitle(titleName);
	setISBN(ISBNnum);
    }

    public void setAuthor (String authorName) {
	author = authorName;
    }

    public String getAuthor () {
	return author;
    }

    public void setTitle (String titleName) {
	title = titleName;
    }

    public String getTitle () {
	return title;
    }

    public void setISBN (String ISBNnum) {
	ISBN = ISBNnum;
    }

    public String getISBN () {
	return ISBN;
    }

    public String toString () {
	String answer = "";
	answer += "Title: " + getTitle() + "\n";
	answer += "Author: " + getAuthor() + "\n";
	answer += "ISBN: " + getISBN() + "\n";
	return answer;
    }

}
					   
