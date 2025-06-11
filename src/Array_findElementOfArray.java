import java.util.Scanner;
public class Array_findElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array and element of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element of array to search: ");
        int data = sc.nextInt();
        int idx = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == data){
                idx = i;
                break;
            }
        }
        System.out.print("Index is: "+idx);
    }
}
