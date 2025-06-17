public class Array_ceilFloor {
    public static int findFloor(int[] arr, int key) {
        int low = 0, high = arr.length - 1, floor = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return arr[mid];
            else if (arr[mid] < key) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }
    public static int findCeil(int[] arr, int key) {
        int low = 0, high = arr.length - 1, ceil = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return arr[mid];
            else if (arr[mid] > key) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ceil;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 12};
        int key = 5;
        int floor = findFloor(arr, key);
        int ceil = findCeil(arr, key);
        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
}

