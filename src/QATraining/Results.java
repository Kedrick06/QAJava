package qatraining;

public class Results {

		public static double Biology = 100;
		public static double Physics = 100;
		public static double Chemistry = 90;
		public static double total = Physics + Chemistry + Biology;
		public static double percentage;

	
		public static void displayResults() {
			System.out.println("Physics Marks: " + Physics);
			System.out.println("Biology Marks: " + Biology);
			System.out.println("Physics Marks: " + Chemistry);
			
			System.out.println("Overall Mark: " + total);
		}
	
		public static double displayExamOverall() {
			percentage = total * 100/450;
			return percentage;
	}
	
}

