import java.util.Scanner;
import java.util.Arrays;

public class Array_binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array input
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Input key to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Binary Search
        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key == a[mid]) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found: -1");
    }
}
