import java.util.Scanner;

public class Colors {
    public static String getColorLetter() {
        Scanner scanletter = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the first letter of a color:");
            String color = scanletter.nextLine().trim().toUpperCase();
            switch (color) {
                case "A": return "AC";
                case "B": return "BC";
                case "C": return "CC";
                case "D": return "DC";
                case "E": return "EC";
                case "F": return "FC";
                case "G": return "GC";
                case "H": return "HC";
                case "I": return "IC";
                case "J": return "JC";
                case "K": return "KC";
                case "L": return "LC";
                case "M": return "MC";
                case "N": return "NC";
                case "O": return "OC";
                case "P": return "PC";
                case "Q": return "QC";
                case "R": return "RC";
                case "S": return "SC";
                case "T": return "TC";
                case "U": return "UC";
                case "V": return "VC";
                case "W": return "WC";
                case "X": return "XC";
                case "Y": return "YC";
                case "Z": return "ZC";
                default:
                    System.out.println("You have to enter the letter from a basic latin alphabet.");
            }
        }
    }
}
