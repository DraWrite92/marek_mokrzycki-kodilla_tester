import java.util.Scanner;

public class RandomNumbers {
    int result = 0;
    int sum = 0;

    public int getRandoms() {
        while (sum <= 5000) {
            int random = (int) (Math.random() * 30 + 1);
            sum += random;
            System.out.println(random);
            result = random;
        }
        System.out.println("The sum in this instance is " + sum + ".");
        return sum;
    }

    Scanner sk = new Scanner(System.in);
    int n = sk.nextInt();
    int largest = Integer.MAX_VALUE;
    int smallest = Integer.MIN_VALUE;

    public int getLargest() {
        for (int i = 0; i < n; i++) {
            int scanned = sk.nextInt();
            if (scanned > largest) {
                largest = scanned;
            }
            System.out.println("The largest random number is " + largest + ".");
        }
        return largest;
    }


    public int getSmallest() {
        for (int i = 0; i < n; i++) {
            int scanned = sk.nextInt();
            if (scanned < smallest) {
                smallest = scanned;
            }
            System.out.println("The smallest random number is " + smallest + ".");
        }
        return smallest;
    }
}
