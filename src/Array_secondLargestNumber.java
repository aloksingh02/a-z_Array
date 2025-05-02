import java.util.Scanner;
public class Array_secondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        int a = sc.nextInt();

        if(a<2){
            System.out.println("element must contain 2 element");
            return;
        }

        int arr[] = new int[a];
        System.out.println("Enter the value");
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < a; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest element.");
        } else {
            System.out.println("The second largest element is: " + second);
        }

        sc.close();
    }
}
