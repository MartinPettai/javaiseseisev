import java.util.Random;

public class iseseisev_2 {
    public static void main(String[] args) {
		int esimene = 1;
		int viimane = 5;

		Random random = new Random();

		int suvaline = random.nextInt(viimane + esimene) + esimene;
		System.out.println(suvaline);
    }
}