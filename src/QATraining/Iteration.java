package qatraining;

public class Iteration {

	public static void main(String[] args) {

		int catCount = 0;
		boolean notEnoughCats = true;
		
		while(notEnoughCats) {
			System.out.println("Another cat");
			catCount++;
			
			if(catCount > 273) {
				notEnoughCats = false;
			}
		}
		
			System.out.println("Too many cats what do I do");
		
	}

}
