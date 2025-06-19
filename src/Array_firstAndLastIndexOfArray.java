import java.util.Scanner;
import java.util.Arrays;
public class Array_firstAndLastIndexOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int data = sc.nextInt();

        int low = 0;
        int high = a.length-1;
        int fi = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(data>a[mid]){
                low = mid+1;
            }
            else if(data<a[mid]){
                high = mid-1;
            }
            else{
                fi = mid;
                high = mid-1;
            }
        }
        System.out.println(fi);

        low = 0;
        high = a.length-1;
        int li = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(data>a[mid]){
                low = mid+1;
            }
            else if(data<a[mid]){
                high = mid-1;
            }
            else{
                li = mid;
                low = mid+1;
            }
        }
        System.out.println(li);
    }
}
