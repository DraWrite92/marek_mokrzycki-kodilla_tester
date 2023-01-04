public class ShowUser {
    public static void main(String[] args) {
        User amelia = new User("Amelia", 23);
        User celina = new User("Celina", 28);
        User dylan = new User("Dylan", 26);
        User elena = new User("Elena", 25);
        User gerard = new User("Gerard", 30);
        User hubert = new User("Hubert", 29);
        User joshua = new User("Joshua", 22);
        User mandy = new User("Mandy", 24);
        User quentin = new User("Quentin", 31);
        User uma = new User("Uma", 32);

        User[] users = {amelia, celina, dylan, elena, gerard, hubert, joshua, mandy, quentin, uma};

        amelia.setUser(users);
        amelia.ageAverage();
        amelia.peopleUnderAverage();
    }
}
