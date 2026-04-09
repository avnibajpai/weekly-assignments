
import java.util.*;
class div_by_5
{
    public static  void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a number: ");
        double num1=sc.nextDouble();
        if(num1 % 5 ==0)
            System.out.println("\nThe number "+num1+" is divisible by 5!");
        else
            System.out.println("the  number "+num1+" is not divisible by 5!");
    }
}