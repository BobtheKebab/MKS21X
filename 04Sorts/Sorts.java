public class Sorts {
    
    public static String name () {
	return "09.Ashraf.Ahbab";
    }

    public static void selectionSort (int[] data) {
	for (int indexNow = 0; indexNow < data.length; indexNow++) {
	    int minIndex = indexNow;
	    for (int count = indexNow; count < data.length; count++) {
		if (data[count] < data[minIndex]) minIndex = count;
		//System.out.println(minIndex);
	    }
	    int toPut = data[minIndex];
	    data[minIndex] = data[indexNow];
	    data[indexNow] = toPut;
	    //System.out.println(data[indexNow]);
	}
    }

    public static void insertionSort (int[] data) {
	for (int indexNow = 1; indexNow < data.length; indexNow++) {
	    int temp = data[indexNow];
	    for (int count = indexNow; count > 0; count--) {
		if (temp >= data[count]) {
		    data[count + 1] = temp;
		    break;
		} else {
		    data[count + 1] = data[count];
		}
	    }
	}
    }
		    
	    


    public static void main (String[] args) {
	
	int[] a = { 69, 100, 50};
	Sorts.insertionSort(a);
	System.out.println(a[0]);
    }

}
