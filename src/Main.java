import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double cm;
        String name;
        int age, feet, inches, remainder;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value


        System.out.println("What year would you like to look up?");

        int year;
        for (year = in.nextInt(); year % 4 == 0; ) {
            System.out.print(year + " is leap-year");
        }
        System.out.print(year + " is not leap-year");
    }
}
