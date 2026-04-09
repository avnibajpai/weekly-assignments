import java.util.Scanner;
class rev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int len=Integer.toString(n).length();
        System.out.println("Digits of "+n+" in reverse order: ");
        int[] digits = new int[len];
        for (int i=len-1;i>=0;i--){
        digits[i]= n%10;
        n=n/10;
        }
        // to reverse an array
        int[] rev = new int[len];
        for (int i=0;i<len;i++){
            rev[i]= digits[len-i-1];
        }
        for (int i=0;i<len;i++){
            System.out.print(rev[i]+" ");
        }

    }
}