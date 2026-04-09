
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        /*
        Create a program to print odd and even numbers between 1 to the number entered by the user.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Printing even numbers between 1 and "+ num+ ": ");

        for(int i=1;i<num;i++){
            if(i%2==0) {
                System.out.print(i + " , ");
            }
        }
        System.out.println("\nPrinting odd numbers between 1 and "+ num+ ": ");
        for(int i=1;i<num;i++){
            if(i%2!=0) {
                System.out.print(i + " , ");
            }
        }
    }
}
