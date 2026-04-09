import java.util.*;
class arrayCopy{
    // lvl 1
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row and column for 2D array:" );
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter array elements for 2D array:" );
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("copying elements of 2d array into 1d array:" );
        int [] copy=new int[m*n];
        for(int i=0; i<m ;i++){
            for(int j=0; j<n; j++){
                copy[m+n]=arr[i][j];
            }
        }
        System.out.println("1d array elements: " );
        for (int j : copy) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}