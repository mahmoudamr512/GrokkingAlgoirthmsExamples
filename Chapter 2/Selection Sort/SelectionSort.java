import java.util.ArrayList; 
import java.util.Collections;

public class SelectionSort
{
	public static void main(String[] args) {
	    
	    // Test! 
	    ArrayList<String> names = new ArrayList<String>();
	    names.add("Brianna");
	    names.add("Mahmoud");
	    names.add("Alaadin");
	    
	    // No return type for selectionSortImproved, but there is one for SelectionSort (We can remove it)
	    selectionSortImproved(names);
	    
	    // Call, name = selectionSort(names); to invoke normal selectionSort!
	    
	    // To invoke builtin quickSort, use Collections.sort(); It uses Improved QuickSort in latest java versions with 
	    // O(nlogn) complexity and improved mergeSort in previous Java versions with the same complexity but less stability!
        System.out.println(names.toString());
	}
	
	// We can use Generics for Flexible Types, but let's keep it simple. 
	
	// I will add all these examples using Generics later!
	
	// Here I use Strings, but you can use any type! I will show you!
	public static ArrayList<String> selectionSort(ArrayList<String> arr) {
	    ArrayList<String> arr1 = new ArrayList<String>();
	    while(arr.size() != 0) {
	        int smallest = 0; 
	        String currentSmallest = arr.get(0);
	        int smallestIndex = 0;
	        // Here we are comparing each array item to the whole array to determine the smallest array index.
	        // To Visualize how this algo works go to: https://visualgo.net/en and choose selectionSort
	        // We can optmize space and make the two array elements switch instead of creating another array!
	 
	        for (int j = 0; j < arr.size() - 1; j++) {
	            if(arr.get(j+1).compareTo(arr.get(j)) <= smallest) {
	              smallest = arr.get(j+1).compareTo(arr.get(j));
	              currentSmallest = arr.get(j+1);
	              smallestIndex = j+1;
	            }
	        }
	        arr1.add(currentSmallest);
	        arr.remove(smallestIndex);
	    }
	    
	    return arr1;
	}
	// Above is a very bad code! We can optmize it a lot! BY using Swap! 
	// Collections.swap(list, i, j);
	
	public static void selectionSortImproved(ArrayList<String> arr) {
	    // No need for new array!
	    
	    // Seems like a bubble sort but not really. 
	    
	    // In bubble sort, we compare each two consecutive elements but here we compare the index with the smallest one in the array!
	    
	    // To change to bubble sort, just change the if condition and it shall work!
	    for (int i = 0; i < arr.size()-1; i++){
	        
	        String currentSmallest = arr.get(i);
	        int smallest = 0; 
	        for (int j = i; j < arr.size(); j++) {
	            if(arr.get(i).compareTo(arr.get(j)) > smallest) {
	              Collections.swap(arr, i, j);
	            }
	        }
	    }
	    
	}

}
