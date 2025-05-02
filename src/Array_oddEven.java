import java.util.Scanner;
public class Array_oddEven {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        int a = sc.nextInt();

        int original[] = new int[a];
        int copy[] = new int[a];

        System.out.println("enter the value in array");
        for(int i=0; i<a; i++){
            original[i]= sc.nextInt();
        }

        for(int i=0; i<a; i++){
            copy[i] = original[i];
        }

        for(int i=0; i<a; i++){
            System.out.println(copy[i] +" ");
        }
        sc.close();
    }
}
