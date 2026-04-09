

import java.util.Scanner;
public class meanHeight {
    //lvl 2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights =new double[11];
        double sum=0;
        System.out.println("Enter the height of players: ");
        for(int i=0;i<11;i++){
            heights[i]=input.nextDouble();
        }
        for(int j=0;j<11;j++){
            sum+=heights[j];
        }
        System.out.println("The mean height of football team is "+sum);
    }
} 
    

