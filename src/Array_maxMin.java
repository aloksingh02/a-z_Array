import java.util.Scanner;

public class Array_maxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element");
        int n = sc.nextInt();

        int []arr = new int[n];

        System.out.println("Enter the element in the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for(int num:arr){
            if(num > max) max = num;
            if(num < min) min = num;
        }

        System.out.println("maximum element :" +max);
        System.out.println("minimum element :" +min);

        sc.close();
    }
}

