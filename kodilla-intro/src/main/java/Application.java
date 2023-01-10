public class Application {
    private String name;
    private double age;
    private double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void getComparison() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 years and taller than 160 cm.");
            }
            else {
                System.out.println("User is 30 years old (or younger) and 160 cm tall (or shorter).");
            }
        }
    }
}
