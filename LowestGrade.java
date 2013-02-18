import java.util.Arrays;

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
	// If there is only 1 or 0 grades
	// don't remove anything, just return the grades array
	if (grades.length <= 1) {
	    return grades;
	} else {
	    // array to hold the grades with the lowest grade removed
	    int [] lowestRemoved = new int[grades.length-1];
	    // Integer to track the lowest grade, initialized to the first grade
	    int lowestGrade = grades[0];

	    // Iterate through the list of grades,
	    // adding all but the lowest grade to the ArrayList
	    for (int i = 1; i < grades.length; i++) {
		if (grades[i] < lowestGrade) {
		    lowestRemoved[i-1] = lowestGrade;
		    lowestGrade = grades[i];
		} else {
		    lowestRemoved[i-1] = grades[i];
		}
	    }
	    // Return the array with the lowest grade removed
	    return lowestRemoved;
	}
    }

    public static String arrayPrint(int [] numbers) {
	return Arrays.toString(numbers);
    }
}
