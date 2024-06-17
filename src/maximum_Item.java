
public class maximum_Item {
    public static void main(String[] args) {
        int[] arr = {11, 56, 985, 484, 85, 569, 636, 14};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=1; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
