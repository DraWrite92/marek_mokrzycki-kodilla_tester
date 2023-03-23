import java.util.Random;

public class RandomNumbers {
    int sum = 0;
    private int minimum;
    private int maximum;

    Random random = new Random();
    public void getRandoms() {
        this.minimum = 0;
        this.maximum = 30;
        while (sum <= 5000) {
            int number = random.nextInt(31);
            sum += number;
            System.out.println(number);
            if(number <= minimum) {
                this.minimum = number;
            }
            if(number >= maximum) {
                this.maximum = number;
            }
        }
        System.out.println("The sum in this instance is " + sum + ".");
    }

    public int getLargest() {
        return maximum;
    }


    public int getSmallest() {
        return minimum;
    }

    public static void main(String[] args) {
        RandomNumbers theRandomizer = new RandomNumbers();
        theRandomizer.getRandoms();
        System.out.println("The minimum number in the random sequence is: " + theRandomizer.getSmallest());
        System.out.println("The maximum number in the random sequence is: " + theRandomizer.getLargest());
    }
}
