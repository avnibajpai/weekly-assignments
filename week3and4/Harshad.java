
import java.util.Scanner;

public class Harshad
{
    public static  void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        int copy=num;
        int sum = 0;
        while (num != 0)
        {
            sum += num % 10;
            num /= 10;
        }
        if(copy%sum==0)
            System.out.println(num+ " is a Harshad number");
        else
            System.out.println(num+ " is not a Harshad number");

    }
}