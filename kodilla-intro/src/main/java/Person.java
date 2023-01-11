public class Person {
    private String name;
    private double age;
    private double height;

    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void personName() {
        if (name != null) {
            System.out.println("User is named " + name + ".");
        }
        else {
            System.out.println("It seems that there is no user to be examined.");
        }
    }

    public void personAge() {
        if (name != null) {
            if (age > 30) {
                System.out.println("User is older than 30 years.");
            }
            else {
                System.out.println("User is 30 years old (or younger).");
            }
        }
    }

    public void personHeight() {
        if (name != null) {
            if (height > 160) {
                System.out.println("User is taller than 160 cm.");
            }
            else {
                System.out.println("User is 160 cm high (or shorter).");
            }
        }
    }
}
