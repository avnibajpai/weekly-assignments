import java.util.Scanner;

class Calc{
    public  static void main(String args[]){
        Scanner input = new Scanner(System.in);
        float num1,num2;
        System.out.print("Enter first number: ");
        num1 = input.nextFloat();
        System.out.print("Enter second number: ");
        num2 = input.nextFloat();
        float sum=num1+num2;
        float diff = (num1>num2)?num1-num2:num2-num1;
        //float div=num1/num2;
        float mul=num1*num2;
        float div2=(num1>num2? num1/num2:num2/num1);
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers  "+num1 +" and "
        + num2+" is:  "+sum +" , "+diff +" , "+mul +" and "+div2);

    }
}