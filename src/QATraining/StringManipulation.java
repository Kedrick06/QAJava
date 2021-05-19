package qatraining;

public class StringManipulation {

	public static void main(String[] args) {
		
		
//		Integer, Boolean, Short, Long, Float, Double, Char, Byte
//		Boolean a = false;
//		Integer b = 0;
//		Short c = 0;
//		Long d = 0L;
//		Float e = 0.5f;
//		Double f = 123.5;
//		Character g = 'a';
//		Byte h = 0;
		
//		String str1= "Hello World";
//		String str2= "Hello World";
//		
//		System.out.println(str1.equals(str2));
//		
//		char[] mycharArray = {'H', 'e', 'l', 'l', 'o'};
//		
//		System.out.println(mycharArray.length);
//		
		String str1 = "ThIsIsSoMeTeXt";
        String str2 = "thisissometext";

        // Converts text to lowercase
        System.out.println(str1.toLowerCase());// output will be: thisisometext

        // Converts text to UPPERCASE
        System.out.println(str1.toUpperCase()); // output will be: THISISSOMETEXT

        // Returns the character at the specified index
        System.out.println(str1.charAt(3)); // output will be: s

        // Returns the first position of the character specified.
        System.out.println(str1.indexOf("I")); // output will be: 2

        // Returns true or false if the string ends with the specified character
        System.out.println(str1.startsWith("t")); // output will be: false

        // Returns true or false if the string ends with the specified character
        System.out.println(str1.endsWith("t")); // output will be: true

        // Returns true or false if the string contains the specified characters
        System.out.println(str1.contains("So")); // output will be: true

        // Returns a new string that is a substring of this string.
        // start index is inclusive and endindex is exclusive
        System.out.println(str1.substring(1, 3)); // output will be: hIs

        // Checks if the values of two strings are the same:
        System.out.println(str1.equals(str2)); // output will be: false

        // Compares two strings ignoring case considerations:
        System.out.println(str1.equalsIgnoreCase(str2)); // output will be: true

        //Searches a string for a specified value and then replaces it with another value
        System.out.println(str1.replace("SoMe", "SOMEREALLYFUN"));  //output will be: ThIsIsSOMEREALLYFUNTeXt


	}

}
