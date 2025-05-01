import java.util.Scanner;
public class Array_oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        int a = sc.nextInt();

        int[] arr = new int[a];
        System.out.println("Enter the array element");
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;

        for(int num : arr){
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("total even: "+even);
        System.out.println("total odd: "+odd);
    }
}
