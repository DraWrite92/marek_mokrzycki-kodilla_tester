import java.io.OptionalDataException;

public class User {
    private String name;
    private int age;
    User[] users;
    private int medAge;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setUser(User[] users) {
        this.users = users;
    }

    public int ageAverage() {
        int result = 0;
        int medAge = 0;
        for (int i = 0; i<users.length; i++) {
            result = result + users[i].age;
        }
        medAge = result/users.length;
        this.medAge = medAge;
        return medAge;
    }

    public void peopleUnderAverage() {
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < medAge) {
                System.out.println(users[i].name);
            }
        }
    }
}