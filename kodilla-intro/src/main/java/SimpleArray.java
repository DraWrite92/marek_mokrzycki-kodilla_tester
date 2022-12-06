public class SimpleArray {
    public static void main(String[] args) {
        String[] elements = new String[5];
        elements[0] = "Hydrogenium (H)";
        elements[1] = "Oxygenium (O)";
        elements[2] = "Helium (He)";
        elements[3] = "Silicum (Si)";
        elements[4] = "Chromium (Cr)";

        //The code below is for an earlier exercise.
        //To activate it, simply delete double slash at the beginning of each row.

        //String anElement = elements[0];
        //System.out.println(anElement);

        int howLargeTable = elements.length;
        System.out.println("Moja tablica zawiera elementów: " + howLargeTable + ".");
    }
}
