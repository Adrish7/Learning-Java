import java.util.Random;
public class WorkingRandom {
	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(7);
		System.out.println(x);
	}
}
