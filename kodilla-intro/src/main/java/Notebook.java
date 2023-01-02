public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight,int price, int year) {
            this.weight = weight;
            this.price = price;
            this.year = year;
    }

    public void comparePrice() {
        if (this.price >= 2500) {
            System.out.println("This laptop is expensive.");
        }
        else if (this.price < 2500 && this.price >= 1500) {
            System.out.println("This laptop is at a good price.");
        }
        else {
            System.out.println("This laptop is very cheap.");
        }
    }

    public void compareWeight() {
        if (this.weight >= 1800) {
            System.out.println("This laptop is heavy.");
        }
        else if (this.weight < 1800 && this.weight >= 1300) {
            System.out.println("This laptop is of moderate weight.");
        }
        else {
            System.out.println("This laptop is lightweight.");
        }
    }

    public void compareYearPlus() {
        if (this.year >= 2020 && this.price >= 2500) {
            System.out.println("This laptop is a high-end expensive new one.");
        }
        else if (this.year < 2020 && this.price >= 2500) {
            System.out.println("This laptop is a rare expensive but old collectible one... or overpriced.");
        }
        else if (this.year >= 2020 && this.price >= 1500) {
            System.out.println("This laptop is a regular affordable new one.");
        }
        else if (this.year < 2020 && this.price >= 1500) {
            System.out.println("This laptop is a well-maintained old but regularly priced one.");
        }
        else if (this.year >= 2020 && this.price < 1500) {
            System.out.println("This laptop is new and suspiciously cheap.");
        }
        else if (this.year < 2020 && this.price < 1500) {
            System.out.println("This laptop is an old cheap one.");
        }
    }
}
