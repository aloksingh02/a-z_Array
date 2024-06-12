import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //here args is string array
        Scanner sc = new Scanner(System.in);
//        int[] num = new int[5];
//        num[0] = 15;
//        num[1] = 25;
//        num[2] = 35;
//        num[3] = 45;
//        num[4] = 55;
//        System.out.println(num[2]);
//
//        //input using for loops
//        for(int i=0; i<num.length; i++){
//            num[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<num.length; i++){
//            System.out.print(num[i]);
//        }



        //Array of the object
        String[] str = new String[4];
        for(int i=0; i<str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        str[2] = "alok";
        System.out.println(Arrays.toString(str));
    }
}
