import java.util.Scanner;
import java.util.Arrays;
public class Array_inverseOfArray2 {
    public static int[] inverse(int[] a) {
        int inv[] = new int[a.length];
        for(int i=0; i<a.length; i++){
            int v = a[i];
            if(v<0 || v>= a.length){
                System.out.println("invalid number "+v+ " value must be in between "+(a.length-1));
                System.exit(0);
            }
            inv[v] = i;
        }
        return inv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " elements (from 0 to " + (n - 1) + "):");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int inv[] = inverse(a);
        System.out.println("After inverse: "+inv);
        System.out.println(Arrays.toString(inv));
    }
}
