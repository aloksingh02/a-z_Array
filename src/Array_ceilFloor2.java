//in sorted array if any number given by user the ceil is just smaller than given number and floor is just larger than the number and suppose if any number is give and it is present in the array then ceil and floor same number that is given.
//example:- 10 20 30 40 50 60 70 80 90 100        if 52 is given then       ceil :-60  &&  floor:-50
// Other if 40 is given than    40 is ceil and floor

import java.util.Scanner;
public class Array_ceilFloor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int low =0;
        int high = a.length-1;
        int floor = 0;
        int ceil = 0;
        while(low < high){
            int mid = (low + high)/2;
            if(data < a[mid]){
                high = mid-1;
                ceil = a[mid];
            }
            else if(data > a[mid]){
                low = mid + 1;
                floor = a[mid];
            }
            else{
                ceil = a[mid];
                floor = a[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
