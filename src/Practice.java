public class Practice {
     public static int search(int arr[], int x ) {
         for(int i=0; i<arr.length; i++){
             if(arr[i] == x)
                 return i;
         }
         return -1;
    }

    public static void main(String[] args) {
        int[] arr ={56, 89, 54, 78, 96, 12};
        int x = 78;
        System.out.println(search(arr, x));
    }
}
