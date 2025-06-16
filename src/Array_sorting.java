import java.util.Scanner;
import java.util.Arrays;
public class Array_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("after sorting: ");
        for(int num:a){
            System.out.println(num+" ");
        }
    }
}
