import java.util.Scanner;
public class Array_subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of element in array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                for(int k=i; k<j; k++){
                    System.out.print(a[k]+ " ");
                }
                System.out.println();
            }
        }
    }
}
