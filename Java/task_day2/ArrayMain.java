public class ArrayMain {
    public static void main(String[] args) {
        int[] myArray = {0, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};

        ArrayAlgorithms m = new ArrayAlgorithms();

        

        int max = m.max(myArray);
        int min = m.min(myArray);

        int searchTarget = Integer.parseInt(args[0]);
        
	long startTime = System.currentTimeMillis(); 

        int result = m.binarySearch(myArray, searchTarget);
        
        long endTime = System.currentTimeMillis() - startTime  ; 

        System.out.println("Maximum value in the array is: " + max);
        System.out.println("Minimum value in the array is: " + min);
        System.out.println("Binary search result: " + result);
        System.out.println("Search running time: " + endTime + " milliseconds");
    }
}