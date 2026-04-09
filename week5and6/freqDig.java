import java.util.Scanner;

class freqDig {
    //lvl 3
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int digits[]=new int[Integer.toString(n).length()];
        int copy=n;
        int len= Integer.toString(n).length();
        for(int i=0;i<len;i++){
            if(copy !=0)
                digits[i]=copy%10;
            else
                break;
            copy=copy/10;
        }
        int[] freq =new int[10];
        
        for(int i=0;i<len;i++){
            freq[digits[i]]++;
            }
        System.out.println("Frequency of each digit: ");
        System.out.println("DIGIT \t FREQUENCY");
        for(int i=0;i<10;i++){
            System.out.println(i+"    \t  "+freq[i]);
        }
        }
    }