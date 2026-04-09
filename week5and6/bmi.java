

import java.text.DecimalFormat;
import java.util.Scanner;
class bmi{
    // lvl 2
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons:");
        int person = sc.nextInt();
        double[] weight=new double[person];
        double[] height=new double[person];
        double[] bmi=new double[person];
        String[] status=new String[person];

        for(int i=0;i<person;i++){
            System.out.println("Enter the weight( in kg) and height (in m) of the person" + (i+1)+":");
            weight[i]=sc.nextDouble();
            height[i]=sc.nextDouble();
        }
        //to find bmi
        for(int i=0;i<person;i++){
        bmi[i]=weight[i]/(Math.pow(height[i],2));
        if(bmi[i] <= 18.4 )
            status[i]="Underweight";
        else if(bmi[i] >= 18.5 && bmi[i] <= 24.9 )
            status[i]="Normal";
        else if(bmi[i] >= 25 && bmi[i] <= 39.9 )
            status[i]="Overweight";
        else
            status[i]="Obese";

        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("HEIGHT \t WEIGHT \t BMI \t STATUS");
        for(int i=0;i<person;i++){
            System.out.println(height[i]+" \t\t "+weight[i]+" \t\t "+df.format(bmi[i])+" \t\t" +status[i]);
        }
    }
}