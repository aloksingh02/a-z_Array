import java.util.Scanner;
public class Array_copyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of array element");
        int a = sc.nextInt();

        int original[] = new int[a];
        int copy[] = new int[a];

        System.out.println("enter the value in the array");
        for(int i=0; i<a; i++){
            original[i] = sc.nextInt();
        }

        for(int num:original){
            if(original[a] == copy[a]){
                System.out.println("both array is same");
            }
            else{
                System.out.println("both array is not same");
            }
        }

    }
}
