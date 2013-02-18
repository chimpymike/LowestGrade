import java.util.List;
import java.util.ArrayList;

class LowestGrade {
    public static void main(String [] args) {
	int [] a = removeLowest(23, 90, 47, 55, 88);
	int [] b = removeLowest(85);
	int [] c = removeLowest();
	int [] d = removeLowest(59, 92, 93, 47, 88, 47);

	System.out.println("a = " + arrayPrint(a));
	System.out.println("b = " + arrayPrint(b));
	System.out.println("c = " + arrayPrint(c));
	System.out.println("d = " + arrayPrint(d));
    }

    public static int [] removeLowest(int ... grades) {
	// ArrayList to hold the array with the lowest grade removed
	List<Integer> lowestRemoved = new ArrayList<Integer>();
	// Integer to track the lowest grade, initialized to the first grade
	int lowestGrade = grades[0];

	// Iterate through the list of grades,
	// adding all but the lowest grade to the ArrayList
	for (int i = 1; i < grades.length; i++) {
	    if (grades[i] < lowestGrade) {
		lowestRemoved.add(lowestGrade);
		lowestGrade = grades[i];
	    } else {
		lowestRemoved.add(grades[i]);
	    }
	}
	// Return the ArrayList as a primitive array
	return lowestRemoved.toArray();
}
