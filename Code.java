public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9}; 
        int key = 7;

        Линейлік іздеу
        int linear = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                linear = i;
                break;
            }
        }
        System.out.println("Линейлік іздеу: " + linear);

        Бинарлық іздеу 
        int left = 0;
        int right = arr.length - 1;
        int binary = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                binary = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Бинарлық іздеу: " + binary);
    }
}
