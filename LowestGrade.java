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
}
