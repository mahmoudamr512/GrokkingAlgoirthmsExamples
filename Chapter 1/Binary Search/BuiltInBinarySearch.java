import java.util.Arrays;

public class BuiltInBinarySearch
{
	public static void main(String[] args) {
	    // Names can be inputted, or anything! THEY HAVE TO BE SORTED!
	    
	    //Sort them using Arrays.sort(arr) if they are not sorted!
		String[] names = {"Abba", "Bin", "CCA"};
		
		System.out.println(Arrays.binarySearch(names, "Bin")); // It printed -1, which is right!
	}
	
	
}
