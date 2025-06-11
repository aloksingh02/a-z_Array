import java.util.Scanner;
public class Array_sumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int arr[] = new int[a];

        System.out.println("Enter the element in the array");
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<a; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of all element is :"+sum);
    }
}
