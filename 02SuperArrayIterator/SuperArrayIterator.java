import java.util.Iterator;
import java.lang.UnsupportedOperationException;

public class SuperArrayIterator implements Iterable<String> {

    private SuperArray sArray;
    private int index;

    public SuperArrayIterator (SuperArray array) {
	sArray = array;
	index = 0;
    }

    public boolean hasNext() {
	try {
	    sArray.get(index + 1);
	} catch (IndexOutOfBoundsException x) {
	    return false;
	}
	return true;
    }


    public void remove () {
	throw new UnsupportedOperationException();
    }

}
