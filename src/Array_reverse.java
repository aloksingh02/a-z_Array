import java.util.Scanner;
public class Array_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int a = sc.nextInt();
        int arr[] = new int[a];

        System.out.println("Enter the value");
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = a-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
        System.out.println("Reverse Array");
        for(int num:arr){
            System.out.println(num +"");
        }
    }
}
