import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] num ={3,5,4,6,9};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] num){
        num[0] =65;
    }
}
