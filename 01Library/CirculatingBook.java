public class CirculatingBook extends LibraryBook {
    
    private String currentHolder, dueDate;

    public CirculatingBook (String authorName, String titleName, String ISBNnum, String callNum) {
	super(authorName, titleName, ISBNnum, callNum);
    }

    public String getCurrentHolder () {
	return currentHolder;
    }

    public void setCurrentHolder (String holder) {
	currentHolder = holder;
    }

    public String getDueDate () {
	return dueDate;
    }

    public void setDueDate (String date) {
	dueDate = date;
    }

    public void checkout (String holder, String date) {
	setCurrentHolder(holder);
	setDueDate(date);
    }

    public void returned () {
	setCurrentHolder("");
	setDueDate("");
    }

    public String circulationStatus () {
	String answer = "";
	if (getDueDate() == "") {
	    answer += "Book available on shelves";
	} else {
	    answer += "Current Holder: " + getCurrentHolder() + "\n";
	    answer += "Due Date: " + getDueDate() + "\n";
	}
	return answer;
    }

    public String toString () {
	String answer = super.toString();
	if (getDueDate() != "") {
	    answer += circulationStatus();
	}
	return answer;
    }

}
       
