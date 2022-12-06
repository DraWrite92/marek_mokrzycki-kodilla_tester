public class Loops {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Marek";
        names[1] = "Gerard";
        names[2] = "Paulina";
        names[3] = "Dorota";

        //for (int i = 0; i <= 10; i++) {
            //System.out.println(i);
        //}

        int x = names.length;

        for (int i = 0; i < x; i++) {
            String name = names[i];
            System.out.println(name);
        }

        //for (int i = x - 1; i >= 0; i--) {
            //String nameRev = names[i];
            //System.out.println(nameRev);
        //}

        }

    public static int sumFromArray(int[] doMath) {
        int result = 0;
        for (int i = 0; i < doMath.length; i++) {
            result = doMath[i];
        }
        return result;
    }

    public static void anArray(String args[]) {
        int[] doMath = new int[5];
        doMath[0] = 72;
        doMath[1] = 64;
        doMath[2] = 35;
        doMath[3] = 10;
        doMath[4] = 98;
    }
}