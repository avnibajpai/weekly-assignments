import java.util.Scanner;
class SmallandLarge{
    //level 1
    public int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest = number1;
        int largest = number2;
        if(smallest >number2)
            smallest = number2;
        if(smallest >number3)
            smallest = number3;
        if(largest <number3)
            largest = number3;
        if(largest <number1)
            largest = number1;
        return new int[] {smallest,largest};


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        SmallandLarge sm=new SmallandLarge();
        System.out.println("The smallest number is "+sm.findSmallestAndLargest(n1,n2,n3)[0]);
        System.out.println("The largest number is "+sm.findSmallestAndLargest(n1,n2,n3)[1]);
    }
}