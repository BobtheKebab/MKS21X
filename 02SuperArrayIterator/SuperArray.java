import java.util.Iterator;

public class SuperArray implements Iterable<String> {
    private String[] data;
    private int size;

    public SuperArray () {
	data = new String[10];
	size = 0;
    }

    public SuperArray (int initialCapacity) {
	if (initialCapacity < 0) {
	    throw new IllegalArgumentException("The initial capacity you set is less than 0");
	}
	data = new String[initialCapacity];
    }

    public int size () {
	return size;
    }

    public String get (int index) {
	if (index < 0 || index >= this.size()) {
	    throw new IndexOutOfBoundsException("The index you tried to get the value of is out of range");
	}
	return data[index];
    }

    public boolean add (String  n) {
	size += 1;
	if (this.size() > data.length) {
	    this.grow();
	}
	data[size - 1] = n;
	return true;
    }

    public void add (int index, String element) {
	if (index < 0 || index > this.size()) {
	    throw new IndexOutOfBoundsException("The index you tried to add to is out of range");
	}
	size += 1;
	if (this.size() > data.length) {
	    this.grow();
	}
	for (int count = this.size(); count > index; count -= 1) {
		data[count] = data[count - 1];
	}
	data[index] = element;
    }

    public void remove (int index) {
	if (index < 0 || index >= this.size()) {
	    throw new IndexOutOfBoundsException("The index you tried to remove is out of range");
	}
	size -= 1;
	for (int count = index; count < this.size(); count += 1) {
	    data[count] = data[count + 1];
	}
    }
    
    public void grow () {
	String[] newArray = new String[data.length + 4];
	for (int count = 0; count < data.length; count += 1) {
	    newArray[count] = data[count];
	}
	data = newArray;
    }

    public void clear () {
	size = 0;
    }

    public boolean isEmpty () {
	if (size == 0) return true;
	else return false;
    }

    public String set (int index, String element) {
	if (index < 0 || index >= this.size()) {
	    throw new IndexOutOfBoundsException("The index you tried to set the value of is out of range");
	}
	String replaced = data[index];
	data[index] = element;
	return replaced;
    }

    public String toString () {
	String answer = "", contents = "";
	for (int count = 0; count < size; count += 1) {
	    contents += " " + data[count] + ",";
	}
	if (contents == "") {
	    answer = "[]";
	}
	else answer = "[" + contents.substring(0, contents.length() - 1) + "]";
	return answer;
    }

    public String toStringDebug () {
	String dataNums = "";
	if (this.toString() != "[]") {
	    dataNums = (this.toString()).substring(1, (this.toString()).length() - 1) + ",";
	}
	for (int count = size; count < data.length; count += 1) {
	    dataNums += " _,";
	}
	String answer = "[" + dataNums.substring(0, dataNums.length() - 1) + "]";
	return answer;
    }
    
    public String[] toArray () {
	String[] dataArray = new String[size];
	for (int count = 0; count < size; count += 1) {
	    dataArray[count] = data[count];
	}
	return dataArray;
    }

    public int indexOf (String element) {
	int answer = -1;
	for (int count = 0; count < size; count += 1) {
	    if (data[count].equals(element)) {
		answer = count;
		break;
	    }
	}
	return answer;
    }

    public int lastIndexOf (String element) {
	int answer = -1;
	for (int count = size - 1; count > -1; count -= 1) {
	    if (data[count].equals(element)) {
		answer = count;
		break;
	    }
	}
	return answer;
    }
    
    public Iterator<String> iterator () {
	SuperArrayIterator iterator = new SuperArrayIterator(this);
	return iterator;
    }
    
}
