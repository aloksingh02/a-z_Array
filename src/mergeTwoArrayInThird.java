import java.util.Scanner;
public class mergeTwoArrayInThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array1");
        int a = sc.nextInt();
        int arr1[] = new int[a];
        System.out.println("enter the value in the array1");
        for(int i=0; i<a; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of array2");
        int b = sc.nextInt();
        int arr2[] = new int[b];
        System.out.println("enter the value in the array2");
        for(int i=0; i<b; i++){
            arr2[i] = sc.nextInt();
        }

        int merge[] = new int[a+ b];

        for(int i=0; i<a; i++){
            merge[i]= arr1[i];
        }

        for(int i=0; i<b; i++){
            merge[a+i] = arr2[i];
        }

        System.out.println("after merging");
        for(int i=0; i<merge.length; i++){
            System.out.println(merge[i]+"");
        }
    }
}
