public class FirstClass2 {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(1600,1750,2021);
        System.out.println("Common laptop; Weight: " + notebook.weight + " g, Price: " + notebook.price + " PLN");
        notebook.comparePrice();
        notebook.compareWeight();
        notebook.compareYearPlus();

        Notebook oldNotebook = new Notebook(1200,1000,2015);
        System.out.println("Old laptop; Weight: " + oldNotebook.weight + " g, Price: " + oldNotebook.price + " PLN");
        oldNotebook.comparePrice();
        oldNotebook.compareWeight();
        oldNotebook.compareYearPlus();

        Notebook heavyNotebook = new Notebook(2000,4000,2023);
        System.out.println("Heavy laptop; Weight: " + heavyNotebook.weight + " g, Price: " + heavyNotebook.price + " PLN");
        heavyNotebook.comparePrice();
        heavyNotebook.compareWeight();
        heavyNotebook.compareYearPlus();
    }
}
