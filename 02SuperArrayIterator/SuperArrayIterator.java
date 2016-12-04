import java.util.Iterator;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public class SuperArrayIterator implements Iterator<String> {

    private SuperArray sArray;
    private int index;

    public SuperArrayIterator (SuperArray SupArray) {
	sArray = SupArray;
	index = 0;
    }

    public boolean hasNext () {
	try {
	    sArray.get(index + 1);
	} catch (IndexOutOfBoundsException x) {
	    return false;
	}
	return true;
    }

    public String next () {
	if (hasNext()) {
	    return sArray.get(index++);
	}
	throw new NoSuchElementException();
    }


    public void remove () {
	throw new UnsupportedOperationException();
    }

}
