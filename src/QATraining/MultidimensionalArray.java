package qatraining;

public class MultidimensionalArray {

	    public static int twoDArray[][] = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}};

	    public static void main(String[] args) {
	        for(int i = 0; i < twoDArray.length; i++) {
	            for(int j = 0; j < twoDArray[i].length; j++) {
	                System.out.print(twoDArray[i][j]);
	            }
	            System.out.println();
	        }
	    }
	}

//In the above example, we are declaring and initialising a multi dimensional array, with 3 arrays inside, each with 3 values. In the main method, we are then looping over the array of arrays with the for loop using i as its index.
//During each iteration of the initial for loop, we loop over the array of values within the outer array and print each of the values to the console.
//Once the three values inside the inner array have been printed, we print a new line so that the next array of values can be printed on its own line
