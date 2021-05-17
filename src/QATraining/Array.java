package qatraining;

public class Array {

	public static void main(String[] args) {
			
//		int[] myIntArr;
		
		// if we initialize a second line we cannot initialize it with values
		
//		myIntArr = new int[3];
//		
		
		// adding values to an array
//		myIntArr[0] = 34;
//		myIntArr[1] = 56;
//		myIntArr[2] = 34;
		
		// declare and initalizing with values		

		int[] myOtherIntArr = { 100, 25, 32, 46 };

//		int someNum = myOtherIntArr[2];
	
			// for loop
			for (int i = 0; i  < myOtherIntArr.length; i++) {
				int iTimesTwo = myOtherIntArr[i] * 2;
//				System.out.println(myOtherIntArr[i]);

			}
			
			// for each loop
			for (int num : myOtherIntArr) {
				if (num % 2 == 0) {
				System.out.println(num);
			}
	}
	}
}
