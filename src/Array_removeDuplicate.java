import java.util.Scanner;
public class Array_removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element to be in array");
        int a = sc.nextInt();
        int arr[] = new int[a];

        System.out.println("Enter the value in the array");
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }

//        int uniqueArray[] = removeDuplicates(arr, a);
    }

}
