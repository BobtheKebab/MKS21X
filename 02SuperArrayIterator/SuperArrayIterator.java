import java.util.Iterator;
import java.util.UnsupportedOperationException;

public class SuperArrayIterator implements Iterable<String> {

    private SuperArray sArray;
    private int index;

    public SuperArrayIterator (SuperArray array) {
	sArray = array;
	index = 0;
    }

    public void hasNext() {
	try 

    public void remove () {
	throw new UnsupportedOperationException();
    }

}
