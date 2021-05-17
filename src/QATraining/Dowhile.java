package qatraining;

public class Dowhile {

		public static int playcount = 0;
		public static boolean playing = true;
		
	public static void main(String[] args) {
		do {
			System.out.println("Playing");
			playcount++;

			if(playcount > 20) {
				playing = false;
				
			}
		} while(playing);
		
		System.out.println("Game Over!");

	}
}
