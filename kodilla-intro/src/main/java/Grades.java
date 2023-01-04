public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade() {
        int result = 0;
        int lastGrade = grades[this.size];
        result = lastGrade;
        System.out.println("The last grade added is " + lastGrade + ".");
        return result;
    }


    public int sumUp() {
        int result = 0;
        int doAverage = 0;
        for (int i=0; i<this.size; i++) {
            result = result + grades[i];
            doAverage = result/this.size;
        }
        System.out.println("The average grade is " + doAverage + ".");
        return doAverage;
    }
}
