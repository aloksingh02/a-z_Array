import java.util.Scanner;

public class Array_inverseOfArray {

    // Function to check for duplicates
    public static boolean hasDuplicates(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) return true;
            }
        }
        return false;
    }

    // Function to compute inverse of the array
    public static int[] inverse(int[] a) {
        int[] inverse = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            inverse[value] = i;
        }
        return inverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter array elements (values from 0 to " + (n - 1) + "):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < 0 || a[i] >= n) {
                System.out.println("Invalid input! Value must be between 0 and " + (n - 1));
                return;
            }
        }

        if (hasDuplicates(a)) {
            System.out.println("Invalid input! Duplicate values are not allowed.");
            return;
        }

        int[] result = inverse(a);

        System.out.println("Inverse of array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
