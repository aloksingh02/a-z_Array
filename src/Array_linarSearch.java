import java.util.Scanner;
public class Array_linarSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of value of array");
        int a = sc.nextInt();
        int arr[] = new int[a];

        System.out.println("Enter the element");
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to found");
        int key = sc.nextInt();

        boolean found = false;
        for(int i=0; i<a; i++){
            if(arr[i]==key){
                System.out.println("element found at index "+i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("element is not found");
        }

    }
}
