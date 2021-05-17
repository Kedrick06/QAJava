package qatraining;

public class Numbers {

	public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 2) {
                continue;
            }
            if(i == 100) {
                break;
            }
            System.out.println(i);
        }
    }
}