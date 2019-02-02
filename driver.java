/**
Sydney Davidson
CSI 213
tests the ComparableSphere and GeometricObject 
**/

public class driver{
	public static void main(String args[]){

	 ComparableSphere white = new ComparableSphere();          // creates a new ComparableSphere object called white
	 ComparableSphere blue = new ComparableSphere("blue", 5);  // creates a new ComparableSphere object called blue
	                                                           // with the color blue and the radius of 5.
	 ComparableSphere red = new ComparableSphere("red", 3);    // creates a new ComparableSphere object called red
	                                                           // with a color of red and the radius of 3 

	 white.setRadius(4);  // gives 'white' the radius of 4

	 ComparableSphere array[] = {white, blue, red}; // creates an array of the spheres

	 // bubble sort
	 int n = array.length;  
     for (int i = 0; i < n-1; i++)                   // loops through the array twice for each element
        for (int j = 0; j < n-i-1; j++) 
            if (array[j].compareTo(array[j+1]) > 0)  // compares the radius of the current sphere  
            {                                        // and the next sphere in the array
               	ComparableSphere temp = array[j];  
                array[j] = array[j+1];               // swaps the current element in the array
                array[j+1] = temp;                   // with the next element in the array
            } 

	for(int i = 0; i < n; i++){
		System.out.println(array[i]);                // prints out the array from smallest radius
	}                                                // to the largest radius



	}
}