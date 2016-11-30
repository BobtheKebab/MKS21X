public class Book {

    private String author, title, ISBN;

    public Book () {
	setAuthor("J. R. R. Tolkien");
	setTitle("Lord of the Rings");
	setISBN("6666666666");
    }

    public Book (string authorName, string titleName, string ISBNnum) {
	setAuthor(authorName);
	setTitle(titleName);
	setISBN(ISBNnum);
    }

    public static void setAuthor (authorName) {
	author = authorName;
    }

    public static String getAuthor () {
	return author;
    }

    public static void setTitle (titleName) {
	title = titleName;
    }

    public static String getTitle () {
	return title;
    }

    public static void setISBN (ISBNnum) {
	ISBN = ISBNnum;
    }

    public static String getISBN () {
	return ISBN;
    }

    public static String toString () {
	String answer = "";
	answer += "Title: " + getTitle() + "\n";
	answer += "Author: " + getAuthor() + "\n";
	answer += "ISBN: " + getISBN() + "\n";
	return answer;
    }

}
					   
