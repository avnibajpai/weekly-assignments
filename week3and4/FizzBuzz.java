
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num>0) {
        if(num%3==0)
            System.out.print("Fizz");
        if(num%5==0)
            System.out.print("Buzz");
        if(num%3==0 && num%5==0)
            System.out.print("FizzBuzz");
        else
            System.out.print(num);
        }
        System.out.println("\nThe number " + num + " is not positive");
        }

    }
