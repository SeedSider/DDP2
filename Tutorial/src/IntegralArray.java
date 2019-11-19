public class IntegralArray {

    private static void print(int[] arr, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            if(i != endIndex -1) System.out.print(arr[i] + " ");
            else System.out.println(arr[i]);
        }
    }

    private static boolean isIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i ++) {
            if (arr[i] <= arr[i + 1]) {
            }
            else {
                return false;
            }
        }
        return true;
    }

    private static int[] insertionSort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while (i >= 0 && key < arr[i]) {
                arr[i + 1] = arr[i];
                i--;

            }
            arr[i + 1] = key;
        }
        return arr;
    }

    private static int count(int countThis, int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (countThis == arr[i]) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] generateRandomArray(int n) {
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = (int) (Math.random()*10);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] list = {1, 10, 4, 7, 5};
        print(list, 0, 3);
        System.out.println(isIncreasing(list));
        int[] list2 = generateRandomArray(10);
        print(list2, 0, list2.length);
        System.out.println(count(3, list2));
        int[] listAfterSort = insertionSort(list2);
        print(listAfterSort, 0, listAfterSort.length);
    }
}