

import java.util.Scanner;
public class factor {
    // lvl 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxFactor = 10;
        int factors[]=new int[maxFactor];
        int index=0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                // Check if array is full
                if (index == maxFactor) {
                    // Double the size
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];

                    // Copy elements to temp array
                    System.arraycopy(factors, 0, temp, 0, factors.length);

                    // Reassign factors array to the new larger array
                    factors = temp;
                    System.out.println("Array resized to " + maxFactor);
                }

                // Add factor to the array
                factors[index] = i;
                index++;
            }
        }

        // 4. Display the factors
        System.out.println("The factors of " + num + " are:");
        for (int k = 0; k < index; k++) {
            System.out.print(factors[k] + (k == index - 1 ? "" : ", "));
        }

    }
}