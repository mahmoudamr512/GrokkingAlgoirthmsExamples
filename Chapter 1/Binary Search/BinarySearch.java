public class BinarySearch
{
	public static void main(String[] args) {
	    // Names can be inputted, or anything! THEY HAVE TO BE SORTED!
	    
	    //Sort them using Arrays.sort(arr) if they are not sorted!
		String[] names = {"Abba", "Bin", "CCA"};
		
		System.out.println(binarySearch(names, "156")); // It printed -1, which is right!
	}
	
	public static int binarySearch(String[] names, String searchName) {
	    
	    int low = 0, high = names.length - 1;
	    
	    while (low <= high) {
	        	    
	        int mid = (low+high)/2;
	        
	        // CompareTo Returns Positive Integer if the searchName is larger than the middle index, so we move right.	    
	        if (searchName.compareTo(names[mid]) > 0) {
	            low = mid + 1;
	        } else if (searchName.compareTo(names[mid]) < 0) {
	            high = mid -1;
	        } else {
	            return mid;
	        }
	    }
	    return -1;
	}
}
