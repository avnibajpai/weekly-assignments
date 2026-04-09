
// lvl 3 q
import java.util.Scanner;
        class Swap{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first and second number:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("\nBEFORE SWAPPING: num1= "+num1+" , num2= "+num2);
        double temp=0;
        // to swap
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("\nAFTER SWAPPING\n num1= "+
        num1+" and  num2= "+num2);

    }
        }