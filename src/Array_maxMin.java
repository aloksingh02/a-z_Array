import java.util.Scanner;

public class Array_maxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int a = sc.nextInt();

        int[] arr = new int[a];

        System.out.println("Enter the values");
        for(int i=0; i<a; i++){
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num:arr){
            if(num > max) max=num;
            if(num < min) min=num;
        }
        System.out.println("maximum number is:"+max);
        System.out.println("minimum number is:"+min);

        sc.close();
    }
}

