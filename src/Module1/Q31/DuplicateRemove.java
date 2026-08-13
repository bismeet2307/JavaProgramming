// duplicates remove

import java.util.Scanner;

public class DuplicateRemove {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] unique = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            for (int j = 0; j < uniqueCount; j++) {

                if (arr[i] == unique[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                unique[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
    }
}