

import java.util.Scanner;
class Check_num{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = input.nextInt();
        if(num1==0) {
            System.out.println("The number " + num1 + " is 0");
        }
            else if( num1 > 0)
                System.out.println("The number " + num1 + " is positive");
            else
        System.out.println("The number " + num1 + " is negative");
        }
    }