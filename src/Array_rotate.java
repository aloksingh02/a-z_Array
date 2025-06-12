import java.util.Scanner;
public class Array_rotate {
    public static void reverse(int a[], int i, int j){
        int li=i;
        int ri=j;
        while(li<ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
    }
    public static void rotate(int[] a, int k) {
        k = k%a.length;
        if(k < 0){
            k = k+a.length;
        }

        reverse(a, 0, a.length-k-1);
        reverse(a, a.length-k, a.length-1);
        reverse(a, 0, a.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter rotation count (k): ");
        int k = sc.nextInt();

        rotate(a, k);

        System.out.print("Rotated Array: ");
        for(int val : a){
            System.out.print(val + " ");
        }
    }
}
