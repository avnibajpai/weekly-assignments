import java.lang.Math;
import java.util.Scanner;
class GenerateandFind
    // level 2
{
    public int[] generate4DigitRandomArray(int size){
    int n[]=new int[size];

    for(int i=0;i<size;i++){
        n[i]=(int)(Math.random()*9000)+1000;
    }
    return n;
    }
    public int[] findAverageMinMax(int[] numbers){
         int avg=0,min=9999,max=0;
        for (int number : numbers) {
            avg = avg + number;
            min = (int) Math.min(number, min);
            max = (int) Math.max(number, max);
        }
        avg=(int ) (avg/numbers.length);
        return new int[]{avg,min,max};
    }
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int size=sc.nextInt();
GenerateandFind obj=new GenerateandFind();
System.out.println("The random generated array elements are: " );
int[] arr =obj.generate4DigitRandomArray(size);
for(int i:arr)
    if(i==arr[size-1])
        System.out.print(i+"  ");
    else
        System.out.print(i+" , ");

System.out.println("\nThe average of elements is : "+obj.findAverageMinMax(arr)[0]);
System.out.println("The maximum of elements is : "+obj.findAverageMinMax(arr)[2]);
System.out.println("The minimum of elements is : "+obj.findAverageMinMax(arr)[1]);


}
}