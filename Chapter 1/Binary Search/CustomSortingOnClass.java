import java.util.Arrays;

public class CustomSortingOnClass
{
	public static void main(String[] args) {
	    // Names can be inputted, or anything! THEY HAVE TO BE SORTED!
	    
	    //Sort them using Arrays.sort(arr) if they are not sorted!
	    
	    // You can definitely use Arrays.sort(arr) here because the class implements Comparable!
		Person[] persons = {new Person("Mousa"), new Person("Alaadin"), new Person("Brianna")};
		
		Arrays.sort(persons);
		Person p = new Person("Mousa");
		System.out.println(Arrays.binarySearch(persons, p)); // It printed 2, which is right!
	}
	
	
}


class Person implements Comparable<Person> {
    
    private String name;
    
    Person(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int compareTo(Person p) {
        return this.getName().compareTo(p.getName());
    }
}
