import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in); // [1]
        while(true) { // [2]
            System.out.println("Enter your name:"); // [3]
            String name = scanner.nextLine().trim(); // [4]
            if (name.length() >= 2) { // [5]
                return name; // [6]
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanning = new Scanner(System.in);
        while(true) {
            System.out.println("Select calculation (A - Add, S - Subtract, D - Divide, M - Multiply):");
            String calc = scanning.nextLine().trim().toUpperCase();
            switch(calc) {
                case "A": return "ADD";
                case "S": return "SUB";
                case "D": return "DIV";
                case "M": return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanNum.nextInt();
        return val;
    }
}
