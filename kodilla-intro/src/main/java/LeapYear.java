public class LeapYear {
    public static void main(String[] args) {
        int year = 1972;

        System.out.println(year);

        if (year % 4 != 0) {
            System.out.println("Normal year");
        } else if (year % 100 != 0) {
            System.out.println("Leap year");
        } else if (year % 400 != 0) {
            System.out.println("Normal year");
        } else {
            System.out.println("Leap year");
        }

    }
}