import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5000; i++) ;
        {
        int number = random.nextInt(30) +1 ;
        }
    }
}
