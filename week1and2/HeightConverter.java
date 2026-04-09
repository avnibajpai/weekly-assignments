import java.text.DecimalFormat;
import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();
        // convert height to feet and inches
        int feet=(int) ((height/2.54)/12);
        double inches= ((height/2.54)-(feet*12));
        DecimalFormat df = new DecimalFormat("0.###");

        System.out.println("\nYour Height in cm is: " + height+" while in feet is- " +feet+" and inches is: " + df.format(inches));
    }

}