import java.util.Scanner;
class Area{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        Write a program that takes the base and height in cm to
         find the area of a triangle in square inches and square centimeters
         */
        System.out.print("Enter the height and base of triangle: ");
        double height=input.nextDouble();
        double base =input.nextDouble();
        double area = 0.5*height*base;
        double area_in_in= area/(2.54*2.54);
        System.out.println("The area of the triangle in sq cm and sq in is: "+area+" sq cm  and sq in is: "+area_in_in);
    }
}