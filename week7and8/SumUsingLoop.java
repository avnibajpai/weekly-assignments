import java.util.Scanner;
//LEVEL 1
class SumUsingLoop{
    int sum(int n){
        int s=0;
        for(int i=0;i<=n;i++)
            s=s+i;
        return s;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        SumUsingLoop obj=new SumUsingLoop();
        System.out.println("The sum of "+n+" is "+obj.sum(n));
    }
}